package com.spring.banking.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Builder
public class Account extends AbstractEntity {

    private String iban;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
}