package main.java.domain;

public class QA extends Employee {
    @Override
    public int getAllocation() {
        return 500;
    }

    @Override
    public int getTotalAllocation() {
        return this.getAllocation();
    }

    @Override
    public String toString() {
        return String.format("QA allocation: %s", getAllocation());
    }
}