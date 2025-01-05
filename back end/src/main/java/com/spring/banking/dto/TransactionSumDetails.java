package com.spring.banking.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Jaouad err
 */
public interface TransactionSumDetails {

  LocalDate getTransactionDate();

  BigDecimal getAmount();

}
