package ru.amstolbov.part3tostreamapi.generics;

import org.junit.Test;
import ru.amstolbov.part3tostreamapi.generics.converttolist.ConvertList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ConvertListTest {

    @Test
    public void test() {
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2});
        list.add(new int[]{3, 4, 5, 6});
        List<Integer> test = Arrays.asList(1, 2, 3, 4, 5, 6);
        ConvertList convertList = new ConvertList();
        List<Integer> result = convertList.convert(list);
        assertThat(result, is(test));
    }

}