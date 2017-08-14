package main.java.domain;

public class Developer extends Employee {
    @Override
    public int getAllocation() {
        return 1000;
    }

    @Override
    public int getTotalAllocation() {
        return this.getAllocation();
    }

    @Override
    public String toString() {
        return String.format("Developer allocation: %s", getAllocation());
    }
}
