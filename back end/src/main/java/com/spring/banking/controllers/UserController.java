package com.spring.banking.controllers;

//import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.spring.banking.dto.LightUserDto;
import com.spring.banking.dto.LightUserDto;
import com.spring.banking.dto.UserDto;
import com.spring.banking.services.UserService;

/**
 * @author jaouad err
 */

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
//@Tag(name = "user")
public class UserController {

  private final UserService service;

  @PostMapping("/")
  public ResponseEntity<Integer> save(
      @RequestBody LightUserDto userDto
  ) {
    return ResponseEntity.ok(service.update(userDto));
  }

  @GetMapping("/")
  public ResponseEntity<List<UserDto>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("/{user-id}")
  public ResponseEntity<UserDto> findById(
      @PathVariable("user-id") Integer userId
  ) {
    return ResponseEntity.ok(service.findById(userId));
  }

  @PatchMapping("/validate/{user-id}")
  public ResponseEntity<Integer> validateAccount(
      @PathVariable("user-id") Integer userId
  ) {
    return ResponseEntity.ok(service.validateAccount(userId));
  }

  @PatchMapping("/invalidate/{user-id}")
  public ResponseEntity<Integer> invalidateAccount(
      @PathVariable("user-id") Integer userId
  ) {
    return ResponseEntity.ok(service.invalidateAccount(userId));
  }

  @DeleteMapping("/{user-id}")
  public ResponseEntity<Void> delete(
      @PathVariable("user-id") Integer userId
  ) {
    service.delete(userId);
    return ResponseEntity.accepted().build();
  }

}
