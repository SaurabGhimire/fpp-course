package assignment8.prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Marketing {
    String employeeName;
    String productName;
    double salesAmount;

    Marketing(String e, String p, double s) {
        employeeName = e;
        productName = p;
        salesAmount = s;
    }

    @Override
    public String toString() {
        return "Marketing: " + getEmployeeName() + ", " + getProductName() + ", " + getSalesAmount();
    }


    public static void sortBySalesAmount(List<Marketing> list) {
        list.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                if (Double.compare(m1.salesAmount, m2.salesAmount) != 0) {
                    return Double.compare(m1.salesAmount, m2.salesAmount);
                } else if (m1.employeeName.compareTo(m2.employeeName) != 0) {
                    return Double.compare(m1.salesAmount, m2.salesAmount);
                }
                return m1.productName.compareTo(m2.productName);
            }
        });
    }

    public static void sortEmployeesByName(List<Marketing> list) {
        list.sort(new Comparator<Marketing>() {
            @Override
            public int compare(Marketing m1, Marketing m2) {
                if (m1.employeeName.compareTo(m2.employeeName) != 0) {
                    return Double.compare(m1.salesAmount, m2.salesAmount);
                }
                if (Double.compare(m1.salesAmount, m2.salesAmount) != 0) {
                    return Double.compare(m1.salesAmount, m2.salesAmount);
                }
                return m1.productName.compareTo(m2.productName);
            }
        });
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Marketing m = (Marketing) obj;
        return Objects.equals(employeeName, m.employeeName) &&
                Objects.equals(productName, m.productName) &&
                salesAmount == m.salesAmount;
    }


    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
}
