package com.spring.banking.repositories;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.banking.models.Contact;

/**
 * @author jaouad err
 */
public interface ContactRepository extends JpaRepository<Contact, Integer> {
    List<Contact> findAllByUserId(Integer userId);
}