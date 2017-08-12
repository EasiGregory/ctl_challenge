package test;

import main.java.domain.Developer;
import main.java.domain.Manager;
import main.java.domain.QA;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllocationTest {

    @Test
    public void verifyQaAllocation() {
        QA qa = new QA();

        assertEquals(qa.getAllocation(), 500);
    }

    @Test
    public void verifyDeveloperAllocation() {
        Developer developer = new Developer();

        assertEquals(developer.getAllocation(), 1000);
    }

    @Test
    public void verifyManagerAllocation() {
        Manager manager = new Manager();

        assertEquals(manager.getAllocation(), 300);
    }

    @Test
    public void verifyManagerWithQaAllocation() {
        Manager manager = new Manager();
        manager.addEmployee(new QA());

        assertEquals(manager.getTeamAllocation(), 800);
    }

    @Test
    public void verifyManagerWithQaAndDeveloperAllocation() {
        Manager manager = new Manager();
        manager.addEmployee(new QA());
        manager.addEmployee(new Developer());

        assertEquals(manager.getTeamAllocation(), 1800);
    }

    @Test
    public void verifyManagerWithManagerQaAndDeveloperAllocation() {
        Manager manager = new Manager();
        manager.addEmployee(new Manager());
        manager.addEmployee(new QA());
        manager.addEmployee(new Developer());

        assertEquals(manager.getTeamAllocation(), 2100);
    }
}
