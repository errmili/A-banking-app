package com.spring.banking.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.spring.banking.models.User;

/**
 * @author jaouad err
 * @since 15.09.24
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {

    private Integer id;


    @NotNull(message = "Le prenom ne doit pas etre vide")
    @NotEmpty(message = "Le prenom ne doit pas etre vide")
    @NotBlank(message = "Le prenom ne doit pas etre vide")
    private String firstname;

    @NotNull(message = "Le nom ne doit pas etre vide")
    @NotEmpty(message = "Le nom ne doit pas etre vide")
    @NotBlank(message = "Le nom ne doit pas etre vide")
    private String lastname;

    @NotNull(message = "L'email ne doit pas etre vide")
    @NotEmpty(message = "L'email ne doit pas etre vide")
    @NotBlank(message = "L'email ne doit pas etre vide")
    @Email(message = "L'email n'est conforme")
    private String email;

    @NotNull(message = "Le mot de passe ne doit pas etre vide")
    @NotEmpty(message = "Le mot de passe ne doit pas etre vide")
    @NotBlank(message = "Le mot de passe ne doit pas etre vide")
    @Size(min = 8, max = 16, message = "Le mot de passe doit etre entre 8 et 16 caracteres")
    private String password;

    private String iban;

    private boolean active;

    public static UserDto fromEntity(User user) {
        // null check
        if (user == null) {
            throw new IllegalArgumentException("UserDto ne peut pas être null");
        }

        return UserDto.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .iban(user.getAccount() == null ? "" : user.getAccount().getIban())
                .active(user.isActive())
                .build();
    }

    public static User toEntity(UserDto user) {
        // null check

        if (user == null) {
            return null; // Retourne null si l'entrée est null
        }

        return User.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .password(user.getPassword())
                .build();
    }
/*
    public static UserDto fromEntity(User user) {
        // Vérification null
        if (user == null) {
            throw new IllegalArgumentException("UserDto ne peut pas être null");
        }

        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstname(user.getFirstname());
        userDto.setLastname(user.getLastname());
        userDto.setEmail(user.getEmail());

        // Vérifie si le compte de l'utilisateur est null avant d'accéder à l'IBAN
        if (user.getAccount() != null) {
            userDto.setIban(user.getAccount().getIban());
        } else {
            userDto.setIban(""); // Valeur par défaut si le compte est null
        }

        userDto.setActive(user.isActive());

        return userDto;
    }

    public static User toEntity(UserDto userDto) {
        if (userDto == null) {
            return null; // Retourne null si l'entrée est null
        }

        User user = new User();
        user.setId(userDto.getId());
        user.setFirstname(userDto.getFirstname());
        user.setLastname(userDto.getLastname());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        return user;
    }*/

}