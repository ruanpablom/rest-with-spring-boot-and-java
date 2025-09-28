package br.com.rpmdev.rest_with_spring_boot_and_java.math;

public class SimpleMath {
    public Double sum(Double number1, Double number2) {
        return number1 + number2;
    }

    public Double sub(Double number1, Double number2) {
        return number1 - number2;
    }

    public Double prod(Double number1, Double number2) {
        return number1 * number2;
    }

    public Double div(Double number1, Double number2) {
        return number1 / number2;
    }

    public Double mean(Double number1, Double number2) {
        return (number1 + number2) / 2;
    }

    public Double sqrt(Double number) {
        return Math.sqrt(number);
    }
}
