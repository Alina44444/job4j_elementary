package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax23To8To23To7Then23() {
        int firstNumber = 23;
        int secondNumber = 8;
        int thirdNumber = 23;
        int fourthNumber = 7;

        int result = Max.max(firstNumber, secondNumber, thirdNumber, fourthNumber);
        int expected = 23;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax42To78To2To57Then78() {
        int firstNumber = 42;
        int secondNumber = 78;
        int thirdNumber = 2;
        int fourthNumber = 57;

        int result = Max.max(firstNumber, secondNumber, thirdNumber, fourthNumber);
        int expected = 78;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax22To1To2To56Then56() {
        int firstNumber = 22;
        int secondNumber = 1;
        int thirdNumber = 2;
        int fourthNumber = 56;

        int result = Max.max(firstNumber, secondNumber, thirdNumber, fourthNumber);
        int expected = 56;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax22To1To2Then22() {
        int firstNumber = 22;
        int secondNumber = 1;
        int thirdNumber = 2;

        int result = Max.max(firstNumber, secondNumber, thirdNumber);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMaxMinus22To1444To2Then1444() {
        int firstNumber = -22;
        int secondNumber = 1444;
        int thirdNumber = 2;

        int result = Max.max(firstNumber, secondNumber, thirdNumber);
        int expected = 1444;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0ToMinus1444To4Then4() {
        int firstNumber = 0;
        int secondNumber = -1444;
        int thirdNumber = 4;

        int result = Max.max(firstNumber, secondNumber, thirdNumber);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2Then2() {
        int firstNumber = 1;
        int secondNumber = 2;
        int result = Max.max(firstNumber, secondNumber);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax22To1Then22() {
        int firstNumber = 22;
        int secondNumber = 1;
        int result = Max.max(firstNumber, secondNumber);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax22To22Then22() {
        int firstNumber = 22;
        int secondNumber = 22;
        int result = Max.max(firstNumber, secondNumber);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }
}