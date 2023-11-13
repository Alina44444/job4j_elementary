package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = money - price;
        int y = 0;
        for (int i = 0; i < coins.length; i++) {
            while (size - coins[i] >= 0) {
                size -= coins[i];
                rsl[y] = coins[i];
                y++;
            }
        }
        return Arrays.copyOf(rsl, y);
    }
}