package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int n = 0;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForSixThenSevenHundredTwenty() {
        int expected = 720;
        int n = 6;
        int out = Factorial.calc(n);
        assertThat(out).isEqualTo(expected);
    }
}
