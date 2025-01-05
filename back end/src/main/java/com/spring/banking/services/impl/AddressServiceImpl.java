package com.spring.banking.services.impl;

import com.spring.banking.dto.AddressDto;
import com.spring.banking.models.Address;
import com.spring.banking.repositories.AddressRepository;
import com.spring.banking.services.AddressService;
import com.spring.banking.validators.ObjectsValidator;
import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author jaouad err
 */

@Service
@RequiredArgsConstructor
public class AddressServiceImpl implements AddressService {

  private final AddressRepository repository;
  private ObjectsValidator<AddressDto> validator;

  @Override
  public Integer save(AddressDto dto) {
    validator.validate(dto);
    Address address = AddressDto.toEntity(dto);
    return repository.save(address).getId();
  }

  @Override
  public List<AddressDto> findAll() {
    return repository.findAll()
        .stream()
        .map(AddressDto::fromEntity)
        .collect(Collectors.toList());
  }

  @Override
  public AddressDto findById(Integer id) {
    return repository.findById(id)
        .map(AddressDto::fromEntity)
        .orElseThrow(() -> new EntityNotFoundException("No address found with the ID : " + id));
  }

  @Override
  public void delete(Integer id) {
    // todo check delete
    repository.deleteById(id);
  }
}
