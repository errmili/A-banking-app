package com.spring.banking.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.banking.models.Role;

/**
 * @author jaouad err
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(String roleName);
}