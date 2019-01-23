public class Employee {
    protected String firstName;
    protected String lastName;
    protected int employeeID;
    protected double salary;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double netSalary() {
        return salary;
    }

    // Constructor Method
    public Employee(String f, String l, int e, double s) {
        firstName = f;
        lastName = l;
        employeeID = e;
        salary = s;
    }
}
