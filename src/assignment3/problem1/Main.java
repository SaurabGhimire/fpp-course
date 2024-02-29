package assignment3.problem1;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Saurab", "Ghimire", "100", "1000 N", "Fairfield", "52557");
        Customer c2 = new Customer("Bisho", "Silwal", "101", "2000 E", "Chicago", "62133");
        Customer c3 = new Customer("Roshan", "Bhattarai", "102", "3000 NE", "Chicago", "23889");

        Customer[] arr = new Customer[]{c1, c2, c3};
        for (Customer customer : arr) {
            if (customer.billingAddress.getCity().equals("Chicago"))
                System.out.println(customer.toString());
        }
    }
}
