package dev.semicolon.ekolo.data.repositories;

import dev.semicolon.ekolo.data.models.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Wallets extends JpaRepository<Wallet,String> {
}
