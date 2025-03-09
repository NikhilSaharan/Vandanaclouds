import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("--------------------------");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee(101, "Nikhil", 50000);
        Employee emp2 = new Employee(102, "Prashant", 60000);
        Employee emp3 = new Employee(103, "Himuu", 55000);

        // Storing them in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        // Displaying employee details
        System.out.println("Employee Details:");
        System.out.println("===========================");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
    }
}
