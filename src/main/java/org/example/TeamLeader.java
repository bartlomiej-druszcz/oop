package org.example;

public class TeamLeader extends Employee {
    public TeamLeader(int id, long pesel, String name, String surname, Address address, Department department) {
        super(id, pesel, name, surname, address, department, EmployeeRole.TEAM_LEADER);
    }

    @Override
    public String toString() {
        return "\n\n" + EmployeeRole.TEAM_LEADER + super.toString();
    }
}
