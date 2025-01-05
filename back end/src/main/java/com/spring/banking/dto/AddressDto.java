package com.spring.banking.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.spring.banking.models.Address;
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
public class AddressDto {

    private Integer id;

    private String street;

    private Integer houseNumber;

    private Integer zipCode;

    private String city;

    private String county;

    private Integer userId;

    public static AddressDto fromEntity(Address address) {
        return AddressDto.builder()
                .id(address.getId())
                .street(address.getStreet())
                .houseNumber(address.getHouseNumber())
                .zipCode(address.getZipCode())
                .city(address.getCity())
                .county(address.getCounty())
                .userId(address.getUser().getId())
                .build();
    }

    public static Address toEntity(AddressDto address) {
        return Address.builder()
                .id(address.getId())
                .street(address.getStreet())
                .houseNumber(address.getHouseNumber())
                .zipCode(address.getZipCode())
                .city(address.getCity())
                .county(address.getCounty())
                .user(
                        User.builder()
                                .id(address.getUserId())
                                .build()
                )
                .build();
    }

    /*
    public static AddressDto fromEntity(Address address) {
        if (address == null) {
            return null; // Retourne null si l'entrée est null
        }

        AddressDto addressDto = new AddressDto();
        addressDto.setId(address.getId());
        addressDto.setStreet(address.getStreet());
        addressDto.setHouseNumber(address.getHouseNumber());
        addressDto.setZipCode(address.getZipCode());
        addressDto.setCity(address.getCity());
        addressDto.setCounty(address.getCounty());

        // Vérifie que l'utilisateur n'est pas null avant d'accéder à son ID
        if (address.getUser() != null) {
            addressDto.setUserId(address.getUser().getId());
        }

        return addressDto;
    }

    public static Address toEntity(AddressDto addressDto) {
        if (addressDto == null) {
            return null; // Retourne null si l'entrée est null
        }

        Address address = new Address();
        address.setId(addressDto.getId());
        address.setStreet(addressDto.getStreet());
        address.setHouseNumber(addressDto.getHouseNumber());
        address.setZipCode(addressDto.getZipCode());
        address.setCity(addressDto.getCity());
        address.setCounty(addressDto.getCounty());

        // Création d'un objet User et assignation des valeurs
        User user = new User();
        user.setId(addressDto.getUserId());
        address.setUser(user);

        return address;
    }

*/
}
