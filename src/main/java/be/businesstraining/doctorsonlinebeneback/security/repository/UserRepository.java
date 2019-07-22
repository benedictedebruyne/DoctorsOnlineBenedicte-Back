package be.businesstraining.doctorsonlinebeneback.security.repository;

import be.businesstraining.doctorsonlinebeneback.domain.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by stephan on 20.03.16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
