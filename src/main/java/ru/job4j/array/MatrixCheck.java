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

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[]index : board) {
            if (index[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        int indexOne = 0;
        for (char[]indexTwo : board) {
            if (indexTwo[indexOne] == 'X' && (monoHorizontal(board, indexOne) || monoVertical(board, indexOne))) {
                result = true;
                break;
            }
            indexOne++;
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        int indexOne = 0;
        for (char[]indexTwo : board) {
            rsl[indexOne] = board[indexOne][indexOne];
            indexOne++;
        }
        return rsl;
    }
}
