package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differenceandDivide(double first, double second) {
        return difference(first, second) + divide(first, second);
    }

    public static double sumTotal(double first, double second) {
        return sum(first, second) + multiply(first, second)
                + difference(first, second) + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен 1 = " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен 2 = " + differenceandDivide(10, 20));
        System.out.println("Результат расчета равен 3 = " + sumTotal(10, 20));
    }
}
