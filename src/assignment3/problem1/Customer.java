package assignment3.problem1;

public class Customer {
    String firstName, lastName, socSecurityNum;

    Address billingAddress = new Address();

    Customer(String firstName, String lastName, String socSecurityNum, String street, String city, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socSecurityNum = socSecurityNum;
        this.billingAddress.setAddress(street, city, zip);
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

//    public void setShippingAddress(Address shippingAddress) {
//        this.shippingAddress = shippingAddress;
//    }

    public String toString() {
        return "[" + firstName + ", " + lastName + ", " + "ssn: " + socSecurityNum
                + "]";
    }

}
