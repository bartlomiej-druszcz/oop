package org.example;

public class Developer extends Employee {

    public Developer(int id, long pesel, String name, String surname, Address address, Department department) {
        super(id, pesel, name, surname, address, department, EmployeeRole.JAVA_DEVELOPER);
    }

    @Override
    public String toString() {
        return "\n\n" + EmployeeRole.JAVA_DEVELOPER + super.toString();
    }
}
