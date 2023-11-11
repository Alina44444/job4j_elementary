package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty1() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty2() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void one() {
        int x1 = 0;
        int y1 = 5;
        int result = Counter.sum(x1, y1);
        int expected = 15;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void two() {
        int x1 = 0;
        int y1 = 10;
        int result = Counter.sum(x1, y1);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void three() {
        int x1 = 3;
        int y1 = 8;
        int result = Counter.sum(x1, y1);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void four() {
        int x1 = 1;
        int y1 = 1;
        int result = Counter.sum(x1, y1);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}
