package br.com.rpmdev.rest_with_spring_boot_and_java.validations;

import br.com.rpmdev.rest_with_spring_boot_and_java.exception.UnsupportedMathOperationException;
import br.com.rpmdev.rest_with_spring_boot_and_java.requests.converters.NumberConverter;

public class SqrtParamsValidation {
    public static void validate(String number) throws UnsupportedMathOperationException {
        if(!NumberConverter.isNumeric(number)) throw new UnsupportedMathOperationException("Please set a numeric value!");
    }
}
