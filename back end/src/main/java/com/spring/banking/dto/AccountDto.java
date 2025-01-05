package com.spring.banking.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.spring.banking.models.Account;

/**
 * @author jaouad err
 * @since 15.09.22
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {

    private Integer id;

    private String iban;

    private UserDto user;

    public static AccountDto fromEntity(Account account) {

        return AccountDto.builder()
                .id(account.getId())
                .iban(account.getIban())
                .user(UserDto.fromEntity(account.getUser()))
                .build();
    }

    public static Account toEntity(AccountDto account) {
        return Account.builder()
                .id(account.getId())
                .iban(account.getIban())
                .user(UserDto.toEntity(account.getUser()))
                .build();
    }

    /*
    public static AccountDto fromEntity(Account account) {
        if (account == null) {
            return null;
        }

        AccountDto accountDto = new AccountDto();
        accountDto.setId(account.getId());
        accountDto.setIban(account.getIban());
        accountDto.setUser(UserDto.fromEntity(account.getUser()));

        return accountDto;
    }

    public static Account toEntity(AccountDto accountDto) {
        if (accountDto == null) {
            return null; // Retourne null si l'entrée est null
        }

        Account account = new Account();
        account.setId(accountDto.getId());
        account.setIban(accountDto.getIban());

        // Conversion de l'objet UserDto en User
        User user = UserDto.toEntity(accountDto.getUser());
        account.setUser(user);

        return account;
    }*/
}