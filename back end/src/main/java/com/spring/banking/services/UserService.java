package com.spring.banking.services;

import com.spring.banking.dto.AuthenticationRequest;
import com.spring.banking.dto.AuthenticationResponse;
import com.spring.banking.dto.LightUserDto;
import com.spring.banking.dto.UserDto;

/**
 * @author jaouad err
 */
public interface UserService extends AbstractService<UserDto> {

  Integer validateAccount(Integer id);

  Integer invalidateAccount(Integer id);

  AuthenticationResponse register(UserDto user);
//
  AuthenticationResponse authenticate(AuthenticationRequest request);
//
  Integer update(LightUserDto userDto);
}
