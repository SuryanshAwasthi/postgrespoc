package io.getarrays.userservice.repo;

//import io.getarrays.userservice.domain.User;
import io.getarrays.userservice.domain.User1;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Get Arrays (https://www.getarrays.io/)
 * @version 1.0
 * @since 7/10/2021
 */
public interface UserRepo extends JpaRepository<User1, Long> {
    User1 findByUsername(String username);
}
