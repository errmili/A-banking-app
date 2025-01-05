package com.spring.banking.dto;


import java.math.BigDecimal;
import java.time.LocalDate;

import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.spring.banking.models.Transaction;
import com.spring.banking.models.TransactionType;
import com.spring.banking.models.User;

/**
 * @author jaouad err
 * @since 15.09.22
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDto {

    private Integer id;

    @Positive
    private BigDecimal amount;

    private TransactionType type;

    private String destinationIban;

    private LocalDate transactionDate;

    private Integer userId;

    public static TransactionDto fromEntity(Transaction transaction) {
        return TransactionDto.builder()
                .id(transaction.getId())
                .amount(transaction.getAmount())
                .type(transaction.getType())
                .transactionDate(transaction.getTransactionDate())
                .destinationIban(transaction.getDestinationIban())
                .userId(transaction.getUser().getId())
                .build();
    }

    public static Transaction toEntity(TransactionDto transaction) {
        return Transaction.builder()
                .id(transaction.getId())
                .amount(transaction.getAmount())
                .type(transaction.getType())
                .transactionDate(LocalDate.now())
                .destinationIban(transaction.getDestinationIban())
                .user(
                        User.builder()
                                .id(transaction.getUserId())
                                .build()
                )
                .build();
    }

    /*
    public static TransactionDto fromEntity(Transaction transaction) {
        if (transaction == null) {
            return null; // Retourne null si l'entrée est null
        }

        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setId(transaction.getId());
        transactionDto.setAmount(transaction.getAmount());
        transactionDto.setType(transaction.getType());
        transactionDto.setTransactionDate(transaction.getTransactionDate());
        transactionDto.setDestinationIban(transaction.getDestinationIban());

        // Vérifie que l'utilisateur n'est pas null avant d'accéder à son ID
        if (transaction.getUser() != null) {
            transactionDto.setUserId(transaction.getUser().getId());
        }

        return transactionDto;
    }


    public static Transaction toEntity(TransactionDto transactionDto) {
        if (transactionDto == null) {
            return null; // Retourne null si l'entrée est null
        }

        Transaction transaction = new Transaction();
        transaction.setId(transactionDto.getId());
        transaction.setAmount(transactionDto.getAmount());
        transaction.setType(transactionDto.getType());
        transaction.setTransactionDate(LocalDate.now());  // Utilisation de la date actuelle
        transaction.setDestinationIban(transactionDto.getDestinationIban());

        // Création d'un objet User et assignation des valeurs
        User user = new User();
        user.setId(transactionDto.getUserId());
        transaction.setUser(user);

        return transaction;
    }*/

}