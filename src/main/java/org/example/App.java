package org.example;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", "Nowak", 45, "male");
        Person person2 = new Person("Alina", "Kowalska", 88, "female");
        Person person3 = new Person("Janusz", "Nowy", 68, "male");

        person1.fullName();
        System.out.println("Czy na emeryturze? " + person1.isRetired());
        person2.fullName();
        System.out.println("Czy na emeryturze? " + person2.isRetired());
        person3.fullName();
        System.out.println("Czy na emeryturze? " + person3.isRetired());

        System.out.println(person1);
        System.out.println(person1.equals(person2));
    }
}
