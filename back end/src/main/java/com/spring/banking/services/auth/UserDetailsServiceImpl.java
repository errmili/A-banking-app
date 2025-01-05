package com.spring.banking.services.auth;


import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.banking.repositories.UserRepository;

/**
 * @author jaouad err
 */
@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

  private final UserRepository repository;

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    return repository.findByEmail(email)
        .orElseThrow(() -> new EntityNotFoundException("No user was found with the provided email"));
  }
}
