package AssessmentOctober25.Streams;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private int joiningYear;

    public Employee(int id, String name, String department, double salary, int joiningYear) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningYear = joiningYear;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public int getJoiningYear() { return joiningYear; }
}
