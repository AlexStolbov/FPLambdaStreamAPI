package ru.amstolbov.part3tostreamapi.collection.convertarraylisttoarray;

import java.util.Arrays;
import java.util.List;

public class ConvertList2Array {
    /**
     * Преобразовывает входящий список в двумерный массив с заданным количеством строк.
     * @param list входящий список
     * @param rows количество строк возвращаемом массиве
     * @return
     */
    public int[][] toArray(List<Integer> list, int rows) {
        int columns = (int) Math.ceil((float) list.size() / rows);
        int[][] resArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            resArray[i] = Arrays.copyOf(list.stream().mapToInt(p -> p).skip(i * columns).limit(columns).toArray(), columns);
        }
        return resArray;
    }
}
