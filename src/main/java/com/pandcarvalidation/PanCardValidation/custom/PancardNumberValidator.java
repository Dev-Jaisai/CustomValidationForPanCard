package com.pandcarvalidation.PanCardValidation.custom;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class PancardNumberValidator implements ConstraintValidator<PanCarValidation, String> {
    @Override
    public void initialize(PanCarValidation constraintAnnotation) {
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        return s != null && s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
    }
}