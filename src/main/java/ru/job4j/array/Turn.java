package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            if (i >= array.length - i - 1) {
                break;
            }
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}
