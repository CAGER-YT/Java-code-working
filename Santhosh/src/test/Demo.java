//package test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class Demo {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		String a=s.nextLine();
////		char[]b=a.toCharArray();
//		String temp="";
//		for(int i=a.length()-1;i>=0;i--) {
//			temp+=a.charAt(i);
//		}
//		List y=new ArrayList<>();
////		for(String x:a) {
//			y.add(a);
////		}
//		y.stream().filter(x->{x.equals(temp);}).collect(Collectors.toList());
////		System.out.println(temp);
//		
//	}
//}
//
//1. Reverse a String
//
//import java.util.stream.IntStream;
// 
//public class ReverseString {
//public static void main(String[] args) {
//String input = "Hello";
//String reversed = new StringBuilder(input).reverse().toString();
//System.out.println(reversed); // Output: olleH
//}
//}
// 
//2.Reverse a String and Check if Palindrome
//public class ReversePalindromeCheck {
//public static void main(String[] args) {
//String input = "madam";
//String reversed = new StringBuilder(input).reverse().toString();
//boolean isPalindrome = input.equals(reversed);
// 
//System.out.println("Reversed String: " + reversed); // Output: madam
//System.out.println("Is Palindrome: " + isPalindrome); // Output: true
//}
//}
// 
//3. Count the Frequency of Characters in a String
//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
// 
//public class CharFrequency {
//public static void main(String[] args) {
//String input = "hello";
//Map<Character, Long> frequencyMap = input.chars()
//.mapToObj(c -> (char) c)
//.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
// 
//System.out.println(frequencyMap); // Output: {e=1, h=1, l=2, o=1}
//}
//}
// 
// 
//4)write Java code to append first char to end
// 
//in: 123456
//op : 234561
// 
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
// 
//public class AppendFirstCharToEnd {
//public static void main(String[] args) {
//String input = "123456";
// 
//// Using Java 8 Streams to manipulate the string
//String result = IntStream.range(1, input.length()) // Start from 1 to skip the first character
//.mapToObj(i -> String.valueOf(input.charAt(i))) // Map each index to its corresponding character
//.collect(Collectors.joining()) // Collect all characters except the first
//+ input.charAt(0); // Append the first character to the end
// 
//System.out.println("Output: " + result);
//}
//}
// 
//5)write java code take two string arrays
//1) Merge the two arrays into a single array
//2) Find distinct elements from merged arrays and print them
//3) Find elements with their count
//4)Print only elements that are distinct (occur only once)
// 
// 
//import java.util.*;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
// 
//public class MergeAndFindDistinct {
//public static void main(String[] args) {
//// Two input string arrays
//String[] array1 = {"apple", "banana", "orange", "apple", "kiwi"};
//String[] array2 = {"banana", "kiwi", "mango", "pear", "apple"};
// 
//// Merging two string arrays
//String[] mergedArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
//.toArray(String[]::new);
// 
//// Find distinct elements from merged arrays and print them
//List<String> distinctElements = Arrays.stream(mergedArray)
//.distinct()
//.collect(Collectors.toList());
// 
//System.out.println("Distinct Elements: " + distinctElements);
// 
//// Find elements with their count
//Map<String, Long> elementCount = Arrays.stream(mergedArray)
//.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
// 
//System.out.println("Elements with their count: ");
//elementCount.forEach((element, count) -> System.out.println(element + ": " + count));
// 
//// Print only elements that are distinct (occur only once)
//System.out.println("Elements that occur exactly once:");
//elementCount.entrySet().stream()
//.filter(entry -> entry.getValue() == 1) // Filter to get only elements with count 1
//.map(Map.Entry::getKey) // Extract the key (distinct element)
//.forEach(System.out::println); // Print the distinct elements
//}
//}
//6) Consider an Employee Table with columns empname, empsalary, emplocation write a query to fetch emp list based on second highest salary
// 
//SELECT empname, empsalary, emplocation
//FROM Employee
//ORDER BY empsalary DESC
//LIMIT 1 OFFSET 1;
// 
// 
//7) Write an Get API to fetch emplist in ascending order based on salary (empname, empsalary, emplocation)
// 
//Employee Entity
// 
//package com.example.employee.model;
//import javax.persistence.Entity;
//import javax.persistence.Id;
// 
//@Entity
//public class Employee {
//@Id
//private Long id;
//private String empName;
//private double empSalary;
//private String empLocation;
//// Getters and setters
// 
//public Long getId() {
//return id;
//}
// 
//public void setId(Long id) {
//this.id = id;
//}
// 
//public String getEmpName() {
//return empName;
//}
// 
//public void setEmpName(String empName) {
//this.empName = empName;
//}
// 
//public double getEmpSalary() {
//return empSalary;
//}
// 
//public void setEmpSalary(double empSalary) {
//this.empSalary = empSalary;
//}
// 
//public String getEmpLocation() {
//return empLocation;
//}
// 
//public void setEmpLocation(String empLocation) {
//this.empLocation = empLocation;
//}
//}
// 
// 
//Employee Repository Interface
// 
//package com.example.employee.repository;
// 
//import com.example.employee.model.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import java.util.List;
// 
//@Repository
//public interface EmployeeRepository extends JpaRepository<Employee, Long> {
// 
//// Custom query to fetch employees in ascending order by salary
//@Query("SELECT e FROM Employee e ORDER BY e.empSalary ASC")
//List<Employee> findAllEmployeesOrderBySalaryAsc();
//}
//Employee Service
// 
//package com.example.employee.service;
// 
//import com.example.employee.model.Employee;
//import com.example.employee.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
// 
//import java.util.List;
// 
//@Service
//public class EmployeeService {
// 
//@Autowired
//private EmployeeRepository employeeRepository;
// 
//// Fetch employees ordered by salary in ascending order
//public List<Employee> getEmployeesOrderedBySalary() {
//return employeeRepository.findAllEmployeesOrderBySalaryAsc();
//}
//}
//Employee Controller
// 
//package com.example.employee.controller;
// 
//import com.example.employee.model.Employee;
//import com.example.employee.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
// 
//import java.util.List;
// 
//@RestController
//@RequestMapping("/employees")
//public class EmployeeController {
// 
//@Autowired
//private EmployeeService employeeService;
// 
//// GET API to return employees ordered by salary in ascending order
//@GetMapping("/salaryasc")
//public List<Employee> getEmployeesOrderedBySalary() {
//return employeeService.getEmployeesOrderedBySalary();
//}
//}
// 
// 
// 
//8) write java code to perform Arithmetic operators (based on user input)
//take 3 inputs
// 
//import java.util.Arrays;
// 
//import java.util.List;
// 
//import java.util.Scanner;
// 
//import java.util.function.BiFunction;
// 
//public class Main {
// 
//public static void main(String[] args) {
// 
//Scanner sc = new Scanner(System.in);
// 
//// Taking inputs
// 
//System.out.println("Enter three numbers:");
// 
//int a = sc.nextInt();
// 
//int b = sc.nextInt();
// 
//int c = sc.nextInt();
// 
//// List of numbers
// 
//List<Integer> numbers = Arrays.asList(a, b, c);
// 
//// Asking for the operation
// 
//System.out.println("Enter the operation (add, subtract, multiply, divide):");
// 
//String operation = sc.next();
// 
//// Perform the corresponding arithmetic operation using streams
// 
//switch (operation.toLowerCase()) {
// 
//case "add":
// 
//int sum = numbers.stream().reduce(0, Integer::sum);
// 
//System.out.println("Sum: " + sum);
// 
//break;
// 
//case "subtract":
// 
//int subtractResult = numbers.stream().reduce((x, y) -> x - y).orElse(0);
// 
//System.out.println("Difference: " + subtractResult);
// 
//break;
// 
//case "multiply":
// 
//int product = numbers.stream().reduce(1, (x, y) -> x * y);
// 
//System.out.println("Product: " + product);
// 
//break;
// 
//case "divide":
// 
//// Performing division with a check to avoid division by zero
// 
//double divisionResult = numbers.stream()
// 
//.mapToDouble(Double::valueOf)
// 
//.reduce((x, y) -> y != 0 ? x / y : Double.NaN).orElse(Double.NaN);
// 
//System.out.println("Division Result: " + divisionResult);
//break;
// 
//default:
// 
//System.out.println("Invalid operation. Please use add, subtract, multiply, or divide.");
// 
//}
// 
//sc.close();
// 
//}
// 
//}
// 
//9) Take input string combination of number, alphabets and special chars and write Java code to print
//only special chars
//only numbers
//only alphabets
// 
// 
// 
////import java.util.stream.Collectors;
//// 
////public class Main {
//// 
////public static void main(String[] args) {
//// 
////String s = "capgemini1234!2";
//// 
////// 1. Extracting alphabets
//// 
////String alphabets = s.chars()
//// 
////.filter(Character::isLetter) // Filters only letters
//// 
////.mapToObj(c -> String.valueOf((char) c))
//// 
////.collect(Collectors.joining());
//// 
////// 2. Extracting numbers
//// 
////String numbers = s.chars()
//// 
////.filter(Character::isDigit) // Filters only digits
//// 
////.mapToObj(c -> String.valueOf((char) c))
//// 
////.collect(Collectors.joining());
//// 
////// 3. Extracting special characters
//// 
////String specialChars = s.chars()
//// 
////.filter(c -> !Character.isLetterOrDigit(c)) // Filters only non-letter, non-digit
//// 
////.mapToObj(c -> String.valueOf((char) c))
//// 
////.collect(Collectors.joining());
//// 
////System.out.println("Alphabets: " + alphabets);
//// 
////System.out.println("Numbers: " + numbers);
//// 
////System.out.println("Special Characters: " + specialChars);
//// 
////}
//// 
////}
////has context menu