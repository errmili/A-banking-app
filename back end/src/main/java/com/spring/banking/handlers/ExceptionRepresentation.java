package com.spring.banking.handlers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author jaouad err
 */

@Getter
@Builder
@AllArgsConstructor
@JsonInclude(Include.NON_EMPTY)
public class ExceptionRepresentation {

  private String errorMessage;
  private String errorSource;
  private Set<String> validationErrors;

}
