package dev.semicolon.ekolo.data.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Setter
@Getter
@EntityListeners(AuditingEntityListener.class)
public class ATMCard {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String cardNumber;

    @Column(nullable = false)
    private String cardHolderName;

    @Column(nullable = false)
    private String cardCvv;

    @Enumerated(EnumType.STRING)
    private AutomatedTellerMachineCardType automatedTellerMachineCardType;
    private String cardExpiryDate;


    @Column(nullable = false)
    private String bankName;

    @Enumerated(EnumType.STRING)
    private PaymentNetwork paymentNetwork;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wallet_id", nullable = false)
    private Wallet wallet;
}
