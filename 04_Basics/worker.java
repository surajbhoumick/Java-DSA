// Class definition (Blueprint for Employees)
class Employee {
    String name;
    String jobTitle;
    double salary;

    // Method to display employee details
    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }
}

public class worker {
    public static void main(String[] args) {
        // Creating first employee object
        Employee emp1 = new Employee();
        emp1.name = "Alice";
        emp1.jobTitle = "Software Engineer";
        emp1.salary = 70000;

        // Creating second employee object
        Employee emp2 = new Employee();
        emp2.name = "Bob";
        emp2.jobTitle = "Data Analyst";
        emp2.salary = 60000;

        // Calling the method to display information
        emp1.displayInfo();
        System.out.println(); // Just for spacing
        emp2.displayInfo();
    }
}
