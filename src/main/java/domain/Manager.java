package main.java.domain;

import java.util.ArrayList;

public class Manager extends Employee implements HasEmployee {
    private ArrayList<Employee> employees = new ArrayList<>();
    private int totalTeamAllocation;

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public int getTotalAllocation() {
        totalTeamAllocation = getAllocation();
        employees.forEach(employee -> totalTeamAllocation += employee.getTotalAllocation());
        return totalTeamAllocation;
    }

    @Override
    public int getAllocation() {
        return 300;
    }

    @Override
    public String toString() {
        return String.format("Manager allocation: %s\nTeam allocation: %s",
                this.getAllocation(), this.getTotalAllocation());
    }
}