package ru.amstolbov.part3tostreamapi.generics.listtomap;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class UserConvertTest {

    @Test
    public void whenPassListOfUserThenGetMap() {
        User u1 = new User(1, "Alex");
        User u2 = new User(2, "Peter");
        User u3 = new User(3, "Donald");
        User u4 = new User(4, "Martin");
        List<User> list = Arrays.asList(u1, u2, u3, u4);
        HashMap<Integer, User> testMap = new HashMap<>();
        testMap.put(u1.getId(), u1);
        testMap.put(u2.getId(), u2);
        testMap.put(u3.getId(), u3);
        testMap.put(u4.getId(), u4);
        UserConvert userConvert = new UserConvert();
        Map<Integer, User> res = userConvert.process(list);
        assertThat(res, is(testMap));
    }
}