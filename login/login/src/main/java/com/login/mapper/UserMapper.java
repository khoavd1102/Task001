package com.login.mapper;

import com.login.model.User;
import com.login.model.UserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    long countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    int insert(User row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    int insertSelective(User row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    User selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    int updateByExampleSelective(@Param("row") User row, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    int updateByExample(@Param("row") User row, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    int updateByPrimaryKeySelective(User row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Aug 25 23:11:40 ICT 2022
     */
    int updateByPrimaryKey(User row);
}