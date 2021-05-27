package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.ThreeMax;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int k = 5;
        int result = Factorial.calc(k);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int k = 0;
        int result = Factorial.calc(k);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}