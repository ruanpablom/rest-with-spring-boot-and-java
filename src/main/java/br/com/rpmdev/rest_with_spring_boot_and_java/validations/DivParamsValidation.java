package br.com.rpmdev.rest_with_spring_boot_and_java.validations;

import br.com.rpmdev.rest_with_spring_boot_and_java.exception.UnsupportedMathOperationException;
import br.com.rpmdev.rest_with_spring_boot_and_java.requests.converters.NumberConverter;

public class DivParamsValidation {
    public static void validate(String number1, String number2) throws UnsupportedMathOperationException {
        if(!NumberConverter.isNumeric(number1) || !NumberConverter.isNumeric(number2)) throw new UnsupportedMathOperationException("Please set a numeric value!");
        if(NumberConverter.convertToDouble(number2) == 0) throw new UnsupportedMathOperationException("Division by zero!");
    }
}
