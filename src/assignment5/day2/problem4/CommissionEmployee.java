package assignment5.day2.problem4;

public class CommissionEmployee extends Employee {
    double grossSales;
    double commisionRate;

    CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commisionRate) {
        super(firstName, lastName, socialSecurityNumber);

        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    @Override
    public double getPayment() {
        return grossSales * commisionRate;
    }
}
