package com.login.config.db;

import com.login.config.AES;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

@Configuration
public class DatabaseConfig {
    @Value("${db.datasource.url}")
    private String urlDB;

    @Value("${db.datasource.username}")
    private String userName;

    @Value("${db.datasource.password}")
    private String password;

    @Value("${db.datasource.driver-class-name}")
    private String driverClassName;

    private String secretKey = "1@#123zxc";

    @Bean(name = "dataSource")
    public DataSource dataSource(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setJdbcUrl(AES.decrypt(urlDB, secretKey));
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setUsername(AES.decrypt(userName, secretKey));
        hikariConfig.setPassword(AES.decrypt(password, secretKey));

        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);

        return hikariDataSource;
    }


    @Bean(name = "transactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath:mapper/sql/*.xml"));

        return sqlSessionFactoryBean.getObject();
    }
}
