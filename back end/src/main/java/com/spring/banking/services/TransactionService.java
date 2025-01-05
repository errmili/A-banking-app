package com.spring.banking.services;

import com.spring.banking.dto.TransactionDto;
import java.util.List;

/**
 * @author jaouad err
 */
public interface TransactionService extends AbstractService<TransactionDto> {

  List<TransactionDto> findAllByUserId(Integer userId);
}
