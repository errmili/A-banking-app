package com.spring.banking.controllers;

//import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.banking.dto.AddressDto;
import com.spring.banking.services.AddressService;

/**
 * @author jaouad err
 */

@RestController
@RequestMapping("/adresses")
@RequiredArgsConstructor
//@Tag(name = "address")
public class AddressController {

  private final AddressService service;

  @PostMapping("/")
  public ResponseEntity<Integer> save(
      @RequestBody AddressDto addressDto
  ) {
    return ResponseEntity.ok(service.save(addressDto));
  }

  @GetMapping("/")
  public ResponseEntity<List<AddressDto>> findAll() {
    return ResponseEntity.ok(service.findAll());
  }

  @GetMapping("/{address-id}")
  public ResponseEntity<AddressDto> findById(
      @PathVariable("address-id") Integer addressId
  ) {
    return ResponseEntity.ok(service.findById(addressId));
  }

  @DeleteMapping("/{address-id}")
  public ResponseEntity<Void> delete(
      @PathVariable("address-id") Integer addressId
  ) {
    service.delete(addressId);
    return ResponseEntity.accepted().build();
  }
}
