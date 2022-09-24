package org.example;

/**
 * Napisz klasę Box, które będzie przechowywać elementy dowolnego typu, np. int, String
 */

/**
 * 1) Napisz klasę Person
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
 *
 * 3) Dopisz settery i gettery dla wszystkich pól.
 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public Person() {

    }

    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
