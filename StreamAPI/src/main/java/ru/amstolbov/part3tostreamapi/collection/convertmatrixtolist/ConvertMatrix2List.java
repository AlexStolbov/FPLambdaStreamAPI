package ru.amstolbov.part3tostreamapi.collection.convertmatrixtolist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> res = Arrays.stream(array).flatMap(array2 -> Arrays.stream(array2).boxed()).collect(Collectors.toList());
        return res;
    }
}
