package by.peekhovsky.restview.repository;

import by.peekhovsky.restview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
