package dev.semicolon.ekolo.data.repositories;

import dev.semicolon.ekolo.data.models.IdentityCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentityCards extends JpaRepository<IdentityCard,String> {
}
