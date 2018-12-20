package ru.amstolbov.part3tostreamapi.sorting;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortUser {
    /**
     * Возвращает TreeSet пользователей, отсортированных по возрасту в порядке возрастания.
     * @param list список пользователей
     * @return отсортированный список
     */
    public Set<User> sort(List<User> list) {
        Set<User> res = list.stream().collect(Collectors.toCollection(() -> new TreeSet(Comparator.comparing(User::getAge))));
        return res;
    }

    /**
     * Возвращает список, отсортированный по длине имени
     * @param users список пользователей
     * @return отсортированный список
     */
    public List<User> sortNameLength(List<User> users) {
        List<User> res = users.stream().sorted(Comparator.comparing((u) -> u.getName().length())).collect(Collectors.toList());
        return res;
    }

    /**
     * Возвращает список, отсортированный по имени в лексикографическом порядке, потом по возрасту.
     * @param users список пользователей
     * @return отсортированный список
     */
    public List<User> sortByAllFields(List<User> users) {
        List<User> res = users.stream().sorted((u1, u2) -> u1.getName().equals(u2.getName()) ? u1.getAge().compareTo(u2.getAge()) : u1.getName().compareTo(u2.getName())).collect(Collectors.toList());
        return res;
    }
}
