package org.example;

import java.util.Objects;

/**
 * Napisz klasę Box, które będzie przechowywać elementy dowolnego typu, np. int, String
 * Na podstawie klasy Box stwórz obiekt oraz nową referencję do tego samego obiektu, zaprezentuj
 * modyfikacje na dowolnej referencji.
 * Napisz mechanizm, który stworzy nową niezależną kopię obiektu Box stworzonej w podpunkcie powyżej.
 */

public class Animal {

    private int numberOfLegs;
    private String eats;
    private String name;

    public Animal() {

    }

    public Animal(int numberOfLegs, String eats, String name) {
        this.numberOfLegs = numberOfLegs;
        this.eats = eats;
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Number Of Legs = " + numberOfLegs + ", Eats = " + eats + ", Name = " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return numberOfLegs == animal.numberOfLegs && Objects.equals(eats, animal.eats) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfLegs, eats, name);
    }

    public Animal copy(Animal animal) {
        Animal animalCopy = new Animal();
        animalCopy.numberOfLegs = animal.numberOfLegs;
        animalCopy.name = animal.name;
        animalCopy.eats = animal.eats;
        return animalCopy;
    }
}
