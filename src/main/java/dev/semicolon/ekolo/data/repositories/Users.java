package dev.semicolon.ekolo.data.repositories;

import dev.semicolon.ekolo.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Users extends JpaRepository<User, String> {
}
