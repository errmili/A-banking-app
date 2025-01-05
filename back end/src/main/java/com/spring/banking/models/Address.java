package com.spring.banking.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
//@Builder
public class Address extends AbstractEntity{

    private String street;

    private Integer houseNumber;

    private Integer zipCode;

    private String city;

    private String county;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
}
