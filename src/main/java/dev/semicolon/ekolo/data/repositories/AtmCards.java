package dev.semicolon.ekolo.data.repositories;

import dev.semicolon.ekolo.data.models.ATMCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtmCards extends JpaRepository<ATMCard,String> {
}
