// Base class
public class Employee {
    public int employeeID;    
    protected String department;  
    private double salary;   
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary > 0) {
            salary = newSalary;
            System.out.println("Salary updated successfully!");
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID (Public): " + employeeID);
        System.out.println("Department (Protected): " + department);
        System.out.println("Salary (via getter): ₹" + getSalary());
        System.out.println("Team Size: " + teamSize);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "HR", 40000);
        System.out.println("=== Employee Details ===");
        emp1.displayEmployeeDetails();

        System.out.println();
        emp1.setSalary(45000);
        System.out.println("Updated Salary: ₹" + emp1.getSalary());

        System.out.println("\n=== Manager Details ===");
        Manager mgr1 = new Manager(201, "IT", 80000, 10);
        mgr1.displayManagerDetails();
    }
}
