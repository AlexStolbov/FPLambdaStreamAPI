package ru.amstolbov.part3tostreamapi.collection.convertarraylisttoarray;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ConvertList2ArrayTest {

    @Test
    public void when7ElementsThen9() {
        ConvertList2Array convert = new ConvertList2Array();
        int[][] result = convert.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), 3);
        int[][] except = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 0}
        };
        assertThat(result, is(except));
    }

}