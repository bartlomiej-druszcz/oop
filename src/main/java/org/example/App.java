package org.example;

public class App {
    public static void main(String[] args) {
        /**
         * Na kilku przykładach sprawdź działanie klasy:
         *
         * - utwórz 3 obiekty typu Person (dwa takie same i jeden inny)
         * - porównaj obiekty kazdy z kazdym za pomoca .equals()
         * - wypisz do konsoli "hashcode" wszystkich obiektow
         */
//        Person person1 = new Person("Jan", "Nowak", 45, "male");
//        Person person2 = new Person("Jan", "Nowak", 45, "male");
//        Person person3 = new Person("Janusz", "Nowy", 68, "male");
//
//        person1.fullName();
//        System.out.println("Czy na emeryturze? " + person1.isRetired());
//        person2.fullName();
//        System.out.println("Czy na emeryturze? " + person2.isRetired());
//        person3.fullName();
//        System.out.println("Czy na emeryturze? " + person3.isRetired());
//
//        System.out.println(person1);
//        System.out.println(person1.equals(person2));
//
//        System.out.println("////////////////////////////////////////");
//
//        System.out.println("Person 1 equals Person 2 : " + person1.equals(person2));
//        System.out.println("Person 2 equals Person 3 : " + person1.equals(person3));
//        System.out.println("Person 2 equals Person 3 : " + person2.equals(person3));
//        System.out.println();
//        System.out.println("hashCode Perosn 1 = " + person1.hashCode());
//        System.out.println("hashCode Perosn 2 = " + person2.hashCode());
//        System.out.println("hashCode Perosn 3 = " + person3.hashCode());

        /**
         * Test - Animal
         */

        Animal animal1 = new Animal(4, "grass", "cow");
        Animal animal2 = new Animal(2, "meat", "kangaroo");
        Animal animal3 = new Animal(0, "fishes", "shark");

        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);

        System.out.println("////////////////////////////////////////");
        System.out.println(Department.IT);
    }
}
