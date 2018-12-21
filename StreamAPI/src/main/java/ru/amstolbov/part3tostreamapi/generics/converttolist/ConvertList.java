package ru.amstolbov.part3tostreamapi.generics.converttolist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertList {
    /**
     * Преобразовывает массивы из list в один общий лист
     * @param list список массивов
     * @return общий список элементов из массивов из list
     */
    public List<Integer> convert(List<int[]> list) {
        return list.stream().flatMap(arr -> Arrays.stream(arr).boxed()).collect(Collectors.toList());
    }
}
