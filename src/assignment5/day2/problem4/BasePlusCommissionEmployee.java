package assignment5.day2.problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    double baseSalary;

    BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return super.getPayment() + baseSalary;
    }
}
