package com.spring.banking.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
/**
 * @author jaouad err
 * @since 15.09.24
 */
@RequiredArgsConstructor
@Getter
public class OperationNonPermittedException extends RuntimeException {

    private final String errorMsg;

    private final String operationId;

    private final String source;

    private final String dependency;

    // Constructeur sans arguments
//    public OperationNonPermittedException() {
//        this.errorMsg = "";
//        this.operationId = "";
//        this.source = "";
//        this.dependency = "";
//    }
}