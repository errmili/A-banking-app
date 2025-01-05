package com.spring.banking.services;

import com.spring.banking.dto.ContactDto;
import java.util.List;

/**
 * @author jaouad err
 */
public interface ContactService extends AbstractService<ContactDto> {

  List<ContactDto> findAllByUserId(Integer userId);
}
