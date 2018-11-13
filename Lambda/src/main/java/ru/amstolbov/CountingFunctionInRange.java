package ru.amstolbov;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CountingFunctionInRange {

    private List<Double> diapason(int start, int end, Function<Double, Double> func) {
        final List<Double> res = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            res.add(func.apply((double) i));
        }
        return res;
    }

    public List<Double> linear(final int start, final int end) {
        return diapason(start, end, (par) -> 2 * par);
    }

    public List<Double> square(final int start, final int end) {
        return diapason(start, end, (par) -> par * par);
    }

    public List<Double> log(final int start, final int end) {
        return diapason(start, end, (par) -> Math.log(par));
    }

}
