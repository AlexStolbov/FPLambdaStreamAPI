package ru.amstolbov.part3tostreamapi.generics.listtomap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserConvert {
    public Map<Integer, User> process(List<User> list) {
        return list.stream().collect(Collectors.toMap(User::getId, el -> el));
    }
}
