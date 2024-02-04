package com.pandcarvalidation.PanCardValidation.custom;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PancardNumberValidator.class)
@Target({ElementType.FIELD})
public @interface  PanCarValidation {
    String message() default "Invalid PAN card format";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
