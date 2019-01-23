public class CommissionEmployee extends BaseCommissionEmployee {
    // Fields
// We do not need any new fields since we have declared all the necessary fields already
// Methods
// Note that we do not need a new method to calculate netSalary
// The netSalary from the superclass will work as the percentage is still 10%
// Constructor Method
    public CommissionEmployee(String f, String l, int e, double sls) {
        super(f, l, e, 0, sls);
    }

    public void setSalary(double newSalary) {
        salary = 0;
    }

    @Override
    public double netSalary() {
        return salary + 0.5 * sales;
    }
}