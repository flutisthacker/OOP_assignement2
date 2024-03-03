package C;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1=new Employee(2123,"saman","maharjan",30000);
        System.out.println("salary of the given employee is:" + e1.getSalary());
        System.out.println("Annual salary of the given employee is:" + e1.getAnnualSalary());
        System.out.println("increment of the given employee is:" + e1.raiseSalary(20));
    }
}
