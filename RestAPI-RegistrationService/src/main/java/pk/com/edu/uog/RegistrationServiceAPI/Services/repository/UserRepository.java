package pk.com.edu.uog.RegistrationServiceAPI.Services.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pk.com.edu.uog.RegistrationServiceAPI.Services.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
