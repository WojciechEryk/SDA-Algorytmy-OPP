package Employee;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {


    @Test
    public void checkGetID() {
        Employee nowy = new Employee(1, "a", "b", 100);
        Assert.assertEquals(1,nowy.getId());
    }    @Test
    public void checkGetFirstName() {
        Employee nowy = new Employee(1, "a", "b", 100);
        Assert.assertEquals("a",nowy.getFirstName());
    }    @Test
    public void checkGetLastName() {
        Employee nowy = new Employee(1, "a", "b", 100);
        Assert.assertEquals("b",nowy.getLastName());
    }    @Test
    public void checkGetName() {
        Employee nowy = new Employee(1, "a", "b", 100);
        Assert.assertEquals("a b",nowy.getName());
    }    @Test
    public void checkGetSalary() {
        Employee nowy = new Employee(1, "a", "b", 100);
        Assert.assertEquals(100,nowy.getSalary());
    }    @Test
    public void checkGetAnnualSalary() {
        Employee nowy = new Employee(1, "a", "b", 100);
        Assert.assertEquals(1200,nowy.getAnnualSalary());
    }   @Test
    public void checkSetSalary() {
        Employee nowy = new Employee(1, "a", "b", 100);
        nowy.setSalary(500);
        Assert.assertEquals(500,nowy.getSalary());
    }   @Test
    public void checkRaiseSalary() {
        Employee nowy = new Employee(1, "a", "b", 100);
        nowy.raiseSalary(10);
        Assert.assertEquals(110,nowy.getSalary());
    }

}
