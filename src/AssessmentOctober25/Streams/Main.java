package AssessmentOctober25.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee(1, "Alice", "IT", 75000, 2019),
            new Employee(2, "Bob", "Finance", 65000, 2021),
            new Employee(3, "Charlie", "IT", 90000, 2020),
            new Employee(4, "Diana", "HR", 72000, 2022),
            new Employee(5, "Eve", "Finance", 95000, 2023),
            new Employee(6, "Frank", "IT", 68000, 2021)
        );

        // Task 1
        Map<String, Optional<Employee>> highestPaidByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
            ));

        highestPaidByDept.forEach((dept, emp) ->
            System.out.println(dept + ": " + emp.get().getName())
        );
        System.out.println();

        // Task 2
        long countAfter2020 = employees.stream()
            .filter(e -> e.getJoiningYear() > 2020)
            .count();

        System.out.println("Employees joined after 2020: " + countAfter2020);
        System.out.println();

        // Task 3
        Map<String, List<String>> deptToNames = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.mapping(Employee::getName, Collectors.toList())
            ));

        deptToNames.forEach((dept, names) ->
            System.out.println(dept + ": " + names)
        );
    }
}
