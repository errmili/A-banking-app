package com.spring.banking.services;

//import com.spring.banking.dto.TransactionSumDetails;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.spring.banking.dto.TransactionSumDetails;

/**
 * @author jaouad err
 */
public interface StatisticsService {

  List<TransactionSumDetails> findSumTractionsByDate(LocalDate startDate, LocalDate endDate, Integer userId);

  BigDecimal getAccountBalance(Integer userId);

  BigDecimal highestTransfer(Integer userId);

  BigDecimal highestDeposit(Integer userId);

}
