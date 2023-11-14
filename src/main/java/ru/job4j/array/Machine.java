package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int index = 0;
        for (int i : coins) {
            while (money - price - i >= 0) {
                money -= i;
                rsl[index] = i;
                index++;
            }
        }
        return Arrays.copyOf(rsl, index);
    }
}