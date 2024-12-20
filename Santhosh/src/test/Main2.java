package test;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int id;
    private double salary;
    private int grade;
    private String department;

    // Constructor, Getters, Setters, and toString()

    public Employee(String name, int id, double salary, int grade, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.grade = grade;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", grade=" + grade +
                ", department='" + department + '\'' +
                '}';
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Sample employee list
//    	double a=1.0/0.0;
    	float a=1.0f/0.0f;
    	
    	System.out.println(a);
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", 101, 50000, 7, "HR"),
            new Employee("Bob", 102, 60000, 8, "Finance"),
            new Employee("Charlie", 103, 55000, 9, "HR"),
            new Employee("David", 104, 52000, 6, "HR"),
            new Employee("Eve", 105, 70000, 5, "HR")
        );

        // Filtering HR employees with grade > 6 and giving them a 10% salary hike
        List<Employee> updatedEmployees = employees.stream()
            .filter(emp -> "HR".equals(emp.getDepartment()) && emp.getGrade() > 6)
            .peek(emp -> emp.setSalary(emp.getSalary() * 0.1 + emp.getSalary() ))  // Applying 10% hike
            .collect(Collectors.toList());

        // Output the updated employees
        updatedEmployees.forEach(System.out::println);
    }
}
