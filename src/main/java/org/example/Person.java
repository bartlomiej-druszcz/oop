package org.example;

/**
 * Napisz klasę Box, które będzie przechowywać elementy dowolnego typu, np. int, String
 */

/**
 * ) Napisz klasę Person
 *
 * Z polami:
 *
 * - firstName    ->     STRING
 * - lastName     ->     STRING
 * - age          ->     NUMBER
 * - gender       ->     STRING
 *
 * 2) Dopisz construktor:
 *
 * - bezparametrowy
 * - dla wszystkich parametrów
 */

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(int age) {
        this.name = "NN";
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
