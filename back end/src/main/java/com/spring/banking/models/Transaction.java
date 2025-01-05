package com.spring.banking.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
//@Builder
public class Transaction extends AbstractEntity {

    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private String destinationIban;

    @Column(updatable = false)
    private LocalDate transactionDate;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}