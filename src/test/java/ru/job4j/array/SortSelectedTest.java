package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortOne() {
        int[] data = new int[] {33, 4, 16};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 16, 33};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortTwo() {
        int[] data = new int[] {33, 4, 16, -777, 865};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-777, 4, 16, 33, 865};
        assertThat(result).containsExactly(expected);
    }
}
