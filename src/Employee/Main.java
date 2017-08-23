package Employee;

public class Main {
    public static void main(String[] args) {
        Employee newone = new Employee(1, "Wojciech", "Michalik", 1000);
        System.out.println(newone.toString());
        System.out.println(newone.getAnnualSalary());

        newone.raiseSalary(10);
        System.out.println(newone.toString());
        System.out.println(newone.getAnnualSalary());
    }
}
