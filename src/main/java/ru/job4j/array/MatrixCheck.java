package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char index : board[row]) {
            if (index != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
