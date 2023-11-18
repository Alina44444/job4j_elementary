package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        int counter = 1;
        char symbol = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
             symbol = input.charAt(i);
            if (i < input.length() - 1 && input.charAt(i + 1) == symbol) {
                counter++;
            } else {
                result = counter == 1 ? result + symbol : result + symbol + counter;
                counter = 1;
            }
        }
        return result;
    }
}
