package com.paymentconcentrator.bitcoin.model;

import com.paymentconcentrator.bitcoin.enumeration.TransactionStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private Double amount;

    @Column
    private LocalDateTime timestamp;

    @Column
    private Long merchantOrderId;

    @Column
    private String successUrl;

    @Column
    private String failedUrl;

    @Column
    private String errorUrl;

    @ManyToOne
    private Account seller;

    @Column
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
}
