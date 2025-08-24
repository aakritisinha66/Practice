package com.interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;

        Predicate<String> isWordStartsWith = str -> str.startsWith("A");

        Function<Integer, Integer> doubleMult = x -> x * 2;
        Function<Integer, Integer> tripleMult = x -> x * 3;
        // System.out.println(doubleMult.apply(2));
        // System.out.println(doubleMult.andThen(tripleMult).apply(2));
        // System.out.println(doubleMult.compose(tripleMult).apply(2)); //reverse of andThen

        List<String> names = Arrays.asList("John", "Alice", "Bob", "David", "Anna");
        List<String> result = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        List<String> result1 = names.stream().map(String::toUpperCase).collect(Collectors.toList());

        List<String> result2 = names.stream().sorted().collect(Collectors.toList());
        List<String> result3 = names.stream().sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        List<String> result4 = names.stream().distinct().collect(Collectors.toList());

        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int sum = numbers.stream().reduce(0, Integer::sum);
        int pdt = numbers.stream().reduce(1, (a, b) -> a * b);

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "IT", 6000, 28, Arrays.asList("Java", "Spring", "SQL")),
                new Employee(2, "Bob", "HR", 5000, 35, Arrays.asList("Java", "Angular", "MongoDB")),
                new Employee(3, "Charlie", "IT", 7000, 30, Arrays.asList("AWS", "Spring", "Docker")),
                new Employee(4, "David", "Finance", 4000, 40, Arrays.asList("C++", "Spring", "Angular")),
                new Employee(5, "Eva", "IT", 6500, 25, Arrays.asList("Python", "NodeJS", "Docker")));

        //Filter Employees by Department
        List<Employee> itEmployees = employees.stream().filter(e -> e.getDepartment().equals("IT")).collect(Collectors.toList());
        //Get Names only
        List<String> employeeNames = employees.stream().map(Employee::getName).collect(Collectors.toList());
        //Sort by Salary Descending
        List<Employee> sortedBySalary = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).collect(Collectors.toList());
        //Total Salary
        int sumSalary = employees.stream().collect(Collectors.summingInt(Employee::getSalary));
        int salarySum = employees.stream().map(Employee::getSalary).reduce(0, (a, b) -> a+b);
        int sumOfSalary = employees.stream().mapToInt(Employee::getSalary).sum();
        int parallelSalarySum = employees.parallelStream().mapToInt(Employee::getSalary).sum();
        //Group by Department
        Map<String, List<Employee>> groupByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        //Find any Employee from IT
        Optional<Employee> anyIT = employees.stream().filter(e -> e.getDepartment().equals("IT")).findAny();
        anyIT.ifPresent(System.out::println);
        //Sort By Department (but sort by name if 2 emp have same dept)
        List<Employee> sortedByDept = employees.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sortedByDept);
        //list of all Unique Skills across all Employees
        List<String> uniqueSkils = employees.stream().flatMap(emp -> emp.getSkills().stream()).distinct().collect(Collectors.toList());
        
        //Parallel Stream
        //Shared Mutable Data Problem   
        List<Integer> parallelResult = new ArrayList<>();
        numbers.parallelStream().forEach(parallelResult::add);
        //Correct Way 1: Use Collectors
        numbers.parallelStream().collect(Collectors.toList());
        //Correct Way 2: Use Thread-Safe Collection
        List<Integer> parallelResult1 = Collections.synchronizedList(new ArrayList<>());
        numbers.parallelStream().forEach(parallelResult1::add);
    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private int salary;
    private int age;
    private List<String> skills;

    public Employee(int id, String name, String department, int salary, int age, List<String> skills) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.age = age;
            this.skills = skills;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }
}