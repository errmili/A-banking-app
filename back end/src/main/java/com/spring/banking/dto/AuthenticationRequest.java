package com.spring.banking.dto;

import lombok.Data;

/**
 * @author Ali Bouali
 */
@Data
public class AuthenticationRequest {

  private String email;
  private String password;
}
