package org.example;

import java.util.ArrayList;

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

//        Animal animal1 = new Animal(4, "grass", "cow");
//        Animal animal2 = new Animal(2, "meat", "kangaroo");
//        Animal animal3 = new Animal(0, "fishes", "shark");
//
//        System.out.println(animal1);
//        System.out.println(animal2);
//        System.out.println(animal3);

        /**
         * Test - Enum
         */

//        System.out.println("////////////////////////////////////////");
//        System.out.println(Department.IT);
//
//        System.out.println("////////////////////////////////////////");
//        System.out.println(Department.IT.getDepartmentId());

        /**
         * Test - Address
         */
//        Address address = new Address("Opolska", "Warszawa", "00-123");
//        System.out.println(address);

        /**
         * Test - Employee
         */
//        Employee employee1 = new Employee(1, 34563423456l, "Jan", "Nowak",
//                address, Department.ADMINISTRATION);
//        System.out.println(employee1);

        //Company company = new Company()

        /**
         * TEST
         */
        Developer developer1 = new Developer(1, 11456723456l, "Wojtek", "Diadek",
                new Address("Opolska", "Warszawa", "10-123"), Department.MARKETING);
        Developer developer2 = new Developer(2, 22456723456l, "Piotr", "Piadek",
                new Address("Sueska", "Gdynia", "00-123"), Department.HR);
        Developer developer3 = new Developer(3, 33456723456l, "Alan", "Wiadek",
                new Address("Pazia", "Warszawa", "40-123"), Department.IT);
        Developer developer4 = new Developer(4, 44456723456l, "Bartek", "Ziadek",
                new Address("Znana", "Katowice", "50-123"), Department.ADMINISTRATION);

        TeamLeader teamLeader1 = new TeamLeader(5, 55456723456l, "Wojtek", "Diadek",
                new Address("Opolska", "Warszawa", "50-123"), Department.HEAD);
        TeamLeader teamLeader2 = new TeamLeader(6, 66456723456l, "Piotr", "Piadek",
                new Address("Sueska", "Gdynia", "60-123"), Department.BRANDING);
        TeamLeader teamLeader3 = new TeamLeader(7, 77456723456l, "Alan", "Wiadek",
                new Address("Pazia", "Warszawa", "70-123"), Department.IT);
        TeamLeader teamLeader4 = new TeamLeader(8, 88456723456l, "Bartek", "Ziadek",
                new Address("Znana", "Katowice", "80-123"), Department.SALES);

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(developer1);
        arrayList.add(developer2);
        arrayList.add(developer3);
        arrayList.add(developer4);
        arrayList.add(teamLeader1);
        arrayList.add(teamLeader2);
        arrayList.add(teamLeader3);
        arrayList.add(teamLeader4);

        Company company = new Company(1000, "Nokia",
                new Address("Plater", "Katowice", "33-333"), arrayList);



        System.out.println(company);
    }
}
