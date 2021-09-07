package SimiAlex.com.github.springsecurityjpa.repositories;

import SimiAlex.com.github.springsecurityjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public abstract Optional<User> findUserByUsername(String username);
}
