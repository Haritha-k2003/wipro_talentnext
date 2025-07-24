import java.util.Scanner;

// Person class
public class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }
}

// Employee class extends Person
class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters and Setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

// Main test class
 class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter annual salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter start year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter national insurance number: ");
        String niNumber = scanner.nextLine();

        // Create Employee object
        Employee emp = new Employee(name, salary, year, niNumber);

        // Display employee info
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: $" + emp.getAnnualSalary());
        System.out.println("Start Year: " + emp.getStartYear());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        scanner.close();
    }
}
