package ru.amstolbov.part3tostreamapi.collection.phonedictionary;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PhoneDictionaryTest {

    @Test
    public void whenExistPersonThenFindIt() {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        Person personOne = new Person("Alex", "Ivanov", "123", "Russia");
        Person personTwo = new Person("Igor", "Ivanov", "12345", "Russia");
        Person personThree = new Person("Michael", "Smith", "345", "USA");
        List<Person> checkList = Arrays.asList(personOne, personTwo);
        phoneDictionary.add(personOne, personTwo, personThree);
        List<Person> res = phoneDictionary.find("123");
        assertThat(res, is(checkList));
    }

}