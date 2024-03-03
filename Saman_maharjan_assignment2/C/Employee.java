package C;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id,String firstName,String lastName,int salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }

    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent){
        int newSalary= this.salary + (this.salary * percent /100); 
        return newSalary;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
      return "Employee[" +
          "id=" + id +
          "name=" + firstName + lastName +
          ", salary=" + salary + '\'' +
          ']';
    }
}
