package com.spring.banking.repositories;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.banking.models.User;

/**
 * @author jaouad err
 * @since 13.09.24
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
