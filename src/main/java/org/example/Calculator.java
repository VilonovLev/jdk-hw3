package org.example;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
 * sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
 * над которыми должна быть произведена операция.
 */
public class Calculator{
    public static <T extends Number,E extends Number> Number sum(T num1, E num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <T extends Number,E extends Number> Number multiply(T num1, E num2){
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <T extends Number,E extends Number> Number divide(T num1, E num2){
        return num1.doubleValue() / num2.doubleValue();
    }

    public static <T extends Number,E extends Number> Number subtract(T num1, E num2){
        return num1.doubleValue() - num2.doubleValue();
    }

}
