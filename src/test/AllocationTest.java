package test;

import main.java.domain.Department;
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
    public void verifyDepartmentAllocation() {
        Department department = new Department();

        assertEquals(department.getTotalAllocation(), 0);

    }

    @Test
    public void verifyManagerWithQaAllocation() {
        Manager manager = new Manager();
        manager.addEmployee(new QA());

        assertEquals(manager.getTotalAllocation(), 800);
    }

    @Test
    public void verifyManagerWithQaAndDeveloperAllocation() {
        Manager manager = new Manager();
        manager.addEmployee(new QA());
        manager.addEmployee(new Developer());

        assertEquals(manager.getTotalAllocation(), 1800);
    }

    @Test
    public void verifyDepartmentWithEmployeesAllocation() {
        Department department = new Department();
        Manager managerA = new Manager();
        department.addEmployee(managerA);

        assertEquals(department.getTotalAllocation(), 300);

        Manager managerB = new Manager();
        managerB.addEmployee(new Developer());
        managerB.addEmployee(new Developer());
        department.addEmployee(managerB);

        assertEquals(department.getTotalAllocation(), 2600);

        Manager managerC = new Manager();
        managerC.addEmployee(new QA());
        managerC.addEmployee(new QA());
        managerC.addEmployee(new QA());
        department.addEmployee(managerC);

        assertEquals(department.getTotalAllocation(), 4400);
    }

    @Test
    public void verifyCtlChallengeExample() {
        Manager manager = new Manager();
        manager.addEmployee(new Manager());
        manager.addEmployee(new QA());
        manager.addEmployee(new Developer());

        assertEquals(manager.getTotalAllocation(), 2100);
    }
}
