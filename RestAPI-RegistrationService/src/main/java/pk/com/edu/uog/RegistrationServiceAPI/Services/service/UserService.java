package pk.com.edu.uog.RegistrationServiceAPI.Services.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import pk.com.edu.uog.RegistrationServiceAPI.Services.model.User;
import pk.com.edu.uog.RegistrationServiceAPI.Services.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);

}
