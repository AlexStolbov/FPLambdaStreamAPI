package ru.amstolbov.part3tostreamapi.generics.listtomap;

public class User {
    public int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }
}
