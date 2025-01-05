package com.spring.banking.repositories;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.banking.models.Account;

/**
 * @author Ali Bouali
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {

    Optional<Account> findByIban(String iban);

    Optional<Account> findByUserId(Integer id);
}