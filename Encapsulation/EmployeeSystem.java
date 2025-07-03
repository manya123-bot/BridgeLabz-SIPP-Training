// Abstract Employee class
abstract class Employee {
    private String employeeId, name;

    public Employee(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}

// Department interface
interface Department {
    void assignDepartment(String dept);

    String getDepartmentDetails();
}

// FullTimeEmployee
class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String department;

    public FullTimeEmployee(String id, String name, double salary) {
        super(id, name);
        this.fixedSalary = salary;
    }

    public double calculateSalary() {
        return fixedSalary;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return "Dept: " + department;
    }
}

// PartTimeEmployee
class PartTimeEmployee extends Employee implements Department {
    private double hourlyWage;
    private int hours;
    private String department;

    public PartTimeEmployee(String id, String name, double wage, int hours) {
        super(id, name);
        this.hourlyWage = wage;
        this.hours = hours;
    }

    public double calculateSalary() {
        return hourlyWage * hours;
    }

    public void assignDepartment(String dept) {
        department = dept;
    }

    public String getDepartmentDetails() {
        return "Dept: " + department;
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("F001", "Alice", 70000);
        Employee e2 = new PartTimeEmployee("P001", "Bob", 20, 25);
        ((Department) e1).assignDepartment("HR");
        ((Department) e2).assignDepartment("Sales");
        Employee[] empArr = { e1, e2 };
        for (Employee e : empArr) {
            e.displayDetails();
            if (e instanceof Department)
                System.out.println(((Department) e).getDepartmentDetails());
            System.out.println("-----------");
        }
    }
}