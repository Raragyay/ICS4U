public class BaseCommissionEmployee extends Employee
{
    // Fields
    protected double sales;
    // Methods
    public double getSales()
    {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double netSalary()
    {
        return salary+0.1*sales;
    }
    // Constructor Method
    public BaseCommissionEmployee(String f, String l, int e, double sal, double sale)
    {
        super(f,l,e,sal);
        sales = sale;
    }
}