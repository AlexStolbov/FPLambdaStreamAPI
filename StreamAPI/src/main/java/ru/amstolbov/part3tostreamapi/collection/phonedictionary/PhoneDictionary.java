package ru.amstolbov.part3tostreamapi.collection.phonedictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();

    public void add(Person... persons) {
        for (Person person : persons) {
            this.persons.add(person);
        }
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = persons.stream().filter(person -> person.getName().contains(key)
                                                                || person.getSurname().contains(key)
                                                                || person.getAddress().contains(key)
                                                                || person.getPhone().contains(key)).collect(Collectors.toList());
        return result;
    }

}
