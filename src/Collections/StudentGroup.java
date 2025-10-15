package Collections;

import java.util.*;

class Student {
    private int id;
    private String dept;
    private String subjectName;

    public Student(int id, String dept, String subjectName) {
        this.id = id;
        this.dept = dept;
        this.subjectName = subjectName;
    }

    public int getID() {
        return id;
    }

    public String getDept() {
        return dept;
    }

    public String getSubjectName() {
        return subjectName;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", dept='" + dept + "', subject='" + subjectName + "'}";
    }
}

public class StudentGroup {
    public static void main(String[] args) {

        // Step 1: Create student list
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "CSE", "Java"));
        students.add(new Student(2, "ECE", "Circuits"));
        students.add(new Student(3, "CSE", "Data Structures"));
        students.add(new Student(4, "IT", "Networking"));
        students.add(new Student(5, "ECE", "Electronics"));

        // Step 2: Group by department
        Map<String, List<Student>> deptMap = new HashMap<>();

        for (Student s : students) {
            // if department not in map, create new list
            deptMap.computeIfAbsent(s.getDept(), k -> new ArrayList<>()).add(s);
        }

        // Step 3: Display grouped results
        for (Map.Entry<String, List<Student>> entry : deptMap.entrySet()) {
            System.out.println("Department: " + entry.getKey());
            for (Student s : entry.getValue()) {
                System.out.println("   " + s);
            }
        }
    }
}
