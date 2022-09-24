package org.example;

/**
 * Napisz klasę Box, które będzie przechowywać elementy dowolnego typu, np. int, String
 */

import java.util.Objects;

/**
 * 1) Napisz klasę Person
 * <p>
 * Z polami:
 * <p>
 * - firstName    ->     STRING
 * - lastName     ->     STRING
 * - age          ->     NUMBER
 * - gender       ->     STRING
 * <p>
 * 2) Dopisz construktor:
 * <p>
 * - bezparametrowy
 * - dla wszystkich parametrów
 * <p>
 * 3) Dopisz settery i gettery dla wszystkich pól.
 * <p>
 * 4) dopisz metode fullName()
 * Dopisz metodę public boolean isRetired() sprawdzającą czy osoba jest emerytem (kobieta powyżej 65 lat, mężczyzna powyżej 67)
 * <p>
 * Przeładuj metodę toString() aby wyświetlić wszystkie informacje o danej osobie.
 *
 * Dodaj metody .equals() and .hashcode()
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

    public void fullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isRetired() {
        if ("female".equalsIgnoreCase(gender)) {//zabezpieczenie przed null
            return age > 65;
        } else if ("male".equalsIgnoreCase(gender)) {
            return age > 67;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "FirstName = " + firstName + ", LastName = " + lastName + ", Age = " + age + ", Gender = " + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, gender);
    }
}
