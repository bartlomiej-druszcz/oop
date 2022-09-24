package org.example;

import java.util.Objects;

/**
 * Dodaj pola id, name, surname, pesel, address typu Address department,
 * Dodaj setery, gettery oraz metode toString()
 */

public abstract class Employee implements Workable{
    private int id;
    private long pesel;
    private String name;
    private String surname;
    private Address address;
    private Department department;
    private EmployeeRole employeeRole;

    public Employee(int id, long pesel, String name, String surname, Address address, Department department, EmployeeRole employeeRole) {
        this.id = id;
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "\nid = " + id + ",\npesel = " + pesel + ",\nname = " + name +
                ",\nsurname = " + surname + ",\naddress = " + address + ",\ndepartment = " + department ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id
                && pesel == employee.pesel
                && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname)
                && Objects.equals(address, employee.address)
                && department == employee.department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pesel, name, surname, address, department);
    }

    @Override
    public boolean doWork() {
        return false;
    }
}
