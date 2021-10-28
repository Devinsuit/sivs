package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {1, 2, 3, 4, 8, 11};
        int[] expect = {1, 8, 3, 4, 2, 11};
        int[] rsl = SwitchArray.swap(input, 1, 4);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap5to1() {
        int[] input = {1, 2, 3, 4, 8, 11};
        int[] expect = {1, 11, 3, 4, 8, 2};
        int[] rsl = SwitchArray.swap(input, 5, 1);
        assertThat(rsl, is(expect));
    }
}
