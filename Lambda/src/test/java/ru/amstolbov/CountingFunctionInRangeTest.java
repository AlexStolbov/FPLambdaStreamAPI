package ru.amstolbov;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CountingFunctionInRangeTest {

    @Test
    public void testLinearFunction() {
        CountingFunctionInRange count = new CountingFunctionInRange();
        List<Double> check = Arrays.asList(0D, 2D, 4D, 6D, 8D, 10D, 12D, 14D, 16D);
        List<Double> res = count.linear(0, 8);
        assertThat(res, is(check));
    }

    @Test
    public void testSquareFunction() {
        CountingFunctionInRange count = new CountingFunctionInRange();
        List<Double> check = Arrays.asList(0D, 1D, 4D, 9D, 16D, 25D);
        List<Double> res = count.square(0, 5);
        assertThat(res, is(check));
    }

    @Test
    public void testLogFunction() {
        CountingFunctionInRange count = new CountingFunctionInRange();
        int start = 0;
        int end = 10;
        List<Double> check = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            check.add(Math.log((double) i));
        }
        List<Double> res = count.log(start, end);
        assertThat(res, is(check));
    }

}