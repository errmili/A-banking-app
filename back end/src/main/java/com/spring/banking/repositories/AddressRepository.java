package com.spring.banking.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.banking.models.Address;

/**
 * @author jaouad err
 */
public interface AddressRepository extends JpaRepository<Address, Integer> {
}