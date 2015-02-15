package com.example.o.listviewsimple;

/**
 * Created by o on 14/02/2015.
 */
public class Midwife {
    private int age;
    private String name;
    private String surname;

    public Midwife(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Midwife{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
