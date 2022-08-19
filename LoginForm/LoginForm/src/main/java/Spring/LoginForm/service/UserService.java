package Spring.LoginForm.service;

import Spring.LoginForm.model.User;
import Spring.LoginForm.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
