package br.com.rpmdev.rest_with_spring_boot_and_java.controllers;

import br.com.rpmdev.rest_with_spring_boot_and_java.math.SimpleMath;
import br.com.rpmdev.rest_with_spring_boot_and_java.requests.converters.NumberConverter;
import br.com.rpmdev.rest_with_spring_boot_and_java.validations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {
    private SimpleMath math = new SimpleMath();

    @RequestMapping("/sum/{number1}/{number2}")
    public Double sum(
            @PathVariable("number1") String number1,
            @PathVariable("number2") String number2
    ) {
        SumParamsValidation.validate(number1, number2);

        return math.sum(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/sub/{number1}/{number2}")
    public Double sub(
            @PathVariable("number1") String number1,
            @PathVariable("number2") String number2
    ) {
        SubParamsValidation.validate(number1, number2);

        return math.sub(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/prod/{number1}/{number2}")
    public Double prod(
            @PathVariable("number1") String number1,
            @PathVariable("number2") String number2
    ) {
        ProdParamsValidation.validate(number1, number2);

        return math.prod(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/div/{number1}/{number2}")
    public Double div(
            @PathVariable("number1") String number1,
            @PathVariable("number2") String number2
    ) {
        DivParamsValidation.validate(number1, number2);

        return math.div(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/mean/{number1}/{number2}")
    public Double mean(
            @PathVariable("number1") String number1,
            @PathVariable("number2") String number2
    ) {
        MeanParamsValidation.validate(number1, number2);

        return math.mean(NumberConverter.convertToDouble(number1), NumberConverter.convertToDouble(number2));
    }

    @RequestMapping("/sqrt/{number}")
    public Double sqrt(
            @PathVariable("number") String number1
    ) {
        SqrtParamsValidation.validate(number1);

        return math.sqrt(NumberConverter.convertToDouble(number1));
    }

}
