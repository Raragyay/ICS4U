public class EmployeeTestFile
{
    public static void main (String[] args)
    {
        CommissionEmployee employee1 = new CommissionEmployee("Mark", "Ville", 101, 40000);
        BaseCommissionEmployee employee2 = new BaseCommissionEmployee("Bay", "View", 102, 30000, 5000);
        Employee employee3 = new Employee("Milliken", "Mills", 103, 75000);
        System.out.println(employee1.getEmployeeID() + " has earned: " + employee1.netSalary());
        employee1.setSalary(100000);
        System.out.println(employee1.getEmployeeID() + " has earned: " + employee1.netSalary());
        System.out.println("\n" + employee2.getEmployeeID() + " has earned: " + employee2.netSalary());
        employee2.setSalary(40000);
        System.out.println(employee2.getEmployeeID() + " has earned: " + employee2.netSalary());
        System.out.println("\n" + employee3.getEmployeeID() + " has earned: " + employee3.netSalary());
        employee3.setSalary(80000);
        System.out.println(employee3.getEmployeeID() + " has earned: " + employee3.netSalary());
    }
}