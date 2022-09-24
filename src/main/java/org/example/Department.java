package org.example;

/**
 * Napisz Enum Department.
 * Dodaj ponizsze instancje do eunumu:
 * - HR
 * - BRANDING
 * - SALES
 * - MARKETING
 * - ADMINISTRATION
 * - HEAD
 * - IT
 * <p>
 * dodaj pole "departmentId" typu int oraz konstruktor przyjmujacy departmentId jako parametr.
 */
public enum Department {
    HR(1),
    BRANDING(2),
    SALES(3),
    MARKETING(4),
    ADMINISTRATION(5),
    HEAD(6),
    IT(7);

    private final int departmentId;

    Department(int departmentId) {
        this.departmentId = departmentId;
    }
}
