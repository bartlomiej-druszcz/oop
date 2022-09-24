package org.example;

import java.util.Objects;

/**
 * Napisz klase Address.
 * Dodaj pola street, city, postcode
 * Dodaj setery, gettery oraz metode toString()
 */

public class Address {
    private String street;
    private String city;
    private String postcode;

    public Address(String street, String city, String postcode) {
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "street = '" + street + '\'' +
                ", city = '" + city + '\'' +
                ", postcode = '" + postcode + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(street, address.street)
                && Objects.equals(city, address.city)
                && Objects.equals(postcode, address.postcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, postcode);
    }
}
