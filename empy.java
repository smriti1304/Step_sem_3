class Employee {
    String empName;
    double salary;
    boolean permanent;
}

public class empy {
    public static void main(String[] args) {

        Employee e = new Employee();

        System.out.println("Name: " + e.empName);
        System.out.println("Salary: " + e.salary);
        System.out.println("Permanent: " + e.permanent);
    }
}