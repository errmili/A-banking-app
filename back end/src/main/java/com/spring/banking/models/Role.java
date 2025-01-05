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
public class Role extends AbstractEntity {

    private String name;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;
}

