package EmployeeManagement;

public class Employee {
    private int empID;
    private String empName;
    private String email;
    private Double salary;
    private String role;

    public Employee(int empID, String empName, String email, Double salary, String role) {
        this.empID = empID;
        this.empName = empName;
        this.email = email;
        this.salary = salary;
        this.role = role;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }
}
