package org.example;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Napisz klase Company.
 * Dodaj pola 'id', name oraz adreess typu Address oraz employees jako ArrayList.
 * Dodaj setery, gettery oraz metode toString()
 */

public class Company {
    private int id;
    private String name;
    private Address address;
    private ArrayList<Employee> employees;

    public Company(int id, String name, Address address, ArrayList<Employee> employees) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", address = " + address +
                ", employees = " + employees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company )) return false;
        Company company = (Company) o;//w Java 17 nie trzeba
        return id == company.id
                && Objects.equals(name, company.name)
                && Objects.equals(address, company.address);
               // && Objects.equals(employees, company.employees);//tu tylko referencja
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
