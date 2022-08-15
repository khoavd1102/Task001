package Spring.LoginForm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Spring/LoginForm")
public class LoginFormApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginFormApplication.class, args);
	}

}
