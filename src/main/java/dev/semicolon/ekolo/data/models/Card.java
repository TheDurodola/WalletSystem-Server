package dev.semicolon.ekolo.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String cardNumber;
    private String cardHolderName;
    private String cardCvv;


    private CardType cardType;
    private String cardExpiryDate;


    private String bankName;
    private String issuer;
}
