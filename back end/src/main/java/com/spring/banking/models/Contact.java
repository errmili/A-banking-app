package com.spring.banking.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;


@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
//@Builder
public class Contact extends AbstractEntity {

    private String firstname;

    private String lastname;

    private String email;

    private String iban;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}