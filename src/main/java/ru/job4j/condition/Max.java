package ru.job4j.condition;

public class Max {
    public static int max(int firstNumber, int secondNumber) {
        return firstNumber > secondNumber ? firstNumber : secondNumber;
    }

    public static int max(int firstNumber, int secondNumber, int thirdNumber) {
        return max(max(firstNumber, secondNumber), thirdNumber);
    }

    public static int max(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        return max(max(firstNumber, secondNumber, thirdNumber), fourthNumber);
    }
}