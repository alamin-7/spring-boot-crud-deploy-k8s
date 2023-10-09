package springbootcrudk8s.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootcrudk8s.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
