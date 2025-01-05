package com.spring.banking.exceptions;

import java.util.HashSet;
import java.util.Set;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
/**
 * @author jaouad err
 * @since 15.09.24
 */
@RequiredArgsConstructor
public class ObjectValidationException extends RuntimeException {
//    @Getter
//    private final Set<String> violations;
//    @Getter
//    private final String violationSource;

    @Getter
    private final Set<String> violations;

    @Getter
    private final String violationSource;

    // Constructeur sans arguments si vous en avez besoin
//    public ObjectValidationException() {
//        this.violations = new HashSet<>();
//        this.violationSource = "";
//    }
//
//    // Si vous voulez un constructeur avec des arguments :
//    public ObjectValidationException(Set<String> violations, String violationSource) {
//        this.violations = violations;
//        this.violationSource = violationSource;
//    }
}
