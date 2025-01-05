package com.spring.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.spring.banking.models.Contact;
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
public class ContactDto {

    private Integer id;

    private String firstname;

    private String lastname;

    private String email;

    private String iban;

    private Integer userId;

    public static ContactDto fromEntity(Contact contact) {
        return ContactDto.builder()
                .id(contact.getId())
                .firstname(contact.getFirstname())
                .lastname(contact.getLastname())
                .email(contact.getEmail())
                .iban(contact.getIban())
                .userId(contact.getUser().getId())
                .build();
    }

    public static Contact toEntity(ContactDto contact) {
        return Contact.builder()
                .id(contact.getId())
                .firstname(contact.getFirstname())
                .lastname(contact.getLastname())
                .email(contact.getEmail())
                .iban(contact.getIban())
                .user(
                        User.builder()
                                .id(contact.getUserId())
                                .build()
                )
                .build();
    }

    /*
    public static ContactDto fromEntity(Contact contact) {
        if (contact == null) {
            return null; // Retourne null si l'entrée est null
        }

        ContactDto contactDto = new ContactDto();
        contactDto.setId(contact.getId());
        contactDto.setFirstname(contact.getFirstname());
        contactDto.setLastname(contact.getLastname());
        contactDto.setEmail(contact.getEmail());
        contactDto.setIban(contact.getIban());

        // Vérifie que l'utilisateur n'est pas null avant d'accéder à son ID
        if (contact.getUser() != null) {
            contactDto.setUserId(contact.getUser().getId());
        }

        return contactDto;
    }

    public static Contact toEntity(ContactDto contactDto) {
        if (contactDto == null) {
            return null; // Retourne null si l'entrée est null
        }

        Contact contact = new Contact();
        contact.setId(contactDto.getId());
        contact.setFirstname(contactDto.getFirstname());
        contact.setLastname(contactDto.getLastname());
        contact.setEmail(contactDto.getEmail());
        contact.setIban(contactDto.getIban());

        // Création d'un objet User et assignation des valeurs
        User user = new User();
        user.setId(contactDto.getUserId());
        contact.setUser(user);

        return contact;
    }

*/
}