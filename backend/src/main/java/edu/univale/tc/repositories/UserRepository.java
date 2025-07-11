package edu.univale.tc.repositories;

import edu.univale.tc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByEmail(String email);

    @Query(value = "SELECT email FROM users", nativeQuery = true)
    List<String> findAllUserEmails();
}
