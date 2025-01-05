package com.spring.banking.controllers;

//import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.spring.banking.dto.AuthenticationRequest;
import com.spring.banking.dto.AuthenticationResponse;
import com.spring.banking.dto.UserDto;
import com.spring.banking.services.UserService;

/**
 * @author jaouad err
 */
@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
//@Tag(name = "authentication")
public class AuthenticationController {

  private final UserService userService;

  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(
      @RequestBody UserDto user) {

    return ResponseEntity.ok(userService.register(user));
  }

  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> authenticate(
      @RequestBody AuthenticationRequest request
  ) {
    return ResponseEntity.ok(userService.authenticate(request));
  }

}
