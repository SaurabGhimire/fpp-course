package assignment5.day3.problem5;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[4];
        computers[0] = new Computer("Apple", "M1", 16, 3200);
        computers[1] = new Computer("Dell", "Intel", 32, 4000);
        computers[2] = computers[1];
        computers[3] = new Computer("Dell", "Intel", 32, 4000);
        for (Computer computer : computers) {
            for (Computer c : computers) {
                System.out.println(computer.getManufacturer() + " equals " +
                        c.getManufacturer() + " : " + computer.equals(c)
                );
                System.out.println("Hash code of " + computer.getManufacturer() + " is " + computer.hashCode() + " equals " +
                        c.getManufacturer() + " : " + c.hashCode() + " : " + computer.equals(c));
            }
        }

    }
}
