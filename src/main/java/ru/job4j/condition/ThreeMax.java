package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (result < second || result < third) {
            result = second;
        }
        if (result < first || result < third) {
            result = third;
        }
        return result;
    }
}
