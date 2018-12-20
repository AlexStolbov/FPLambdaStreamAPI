package ru.amstolbov.part3tostreamapi.sorting;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SortUserTest {
    @Test
    public void whenListUsersThenOrderedByAgeSet() {
        User user1 = new User(1, "Alex", 45);
        User user2 = new User(2, "Peter", 35);
        User user3 = new User(3, "Steve", 25);
        List<User> list = Arrays.asList(user1, user2, user3);
        Set<User> test = new TreeSet<User>(Comparator.comparing(User::getAge)) {
            {
                add(user1);
                add(user2);
                add(user3);
            }
        };
        SortUser sortUser = new SortUser();
        Set<User> res = sortUser.sort(list);
        assertThat(res.size(), is(test.size()));
        Iterator itTest = test.iterator();
        Iterator itRes = res.iterator();
        for (int i = 0; i < res.size(); i++) {
            assertThat(itTest.next(), is(itRes.next()));
        }
    }

    @Test
    public void whenListUsersThenOrderedByNamesLengthList() {
        User user1 = new User(1, "Alex", 45);
        User user2 = new User(2, "Peter", 35);
        User user3 = new User(3, "Ludvig", 25);
        List<User> list = Arrays.asList(user1, user3, user2);
        List<User> test = Arrays.asList(user1, user2, user3);
        SortUser sortUser = new SortUser();
        List<User> res = sortUser.sortNameLength(list);
        assertThat(res, is(test));
    }

    @Test
    public void whenListUsersThenOrderedByAllFields() {
        User user1 = new User(1, "Alex", 40);
        User user2 = new User(2, "Alex", 45);
        User user3 = new User(3, "Peter", 15);
        User user4 = new User(4, "Peter", 25);
        User user5 = new User(5, "Ludvig", 25);
        User user6 = new User(6, "Ludvig", 27);
        List<User> list = Arrays.asList(user6, user3, user2, user4, user5, user1);
        List<User> test = Arrays.asList(user1, user2, user5, user6, user3, user4);
        SortUser sortUser = new SortUser();
        List<User> res = sortUser.sortByAllFields(list);
        assertThat(res, is(test));
    }
}