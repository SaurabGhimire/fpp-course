package assignment3.problem1;

public class Address {
    private String _street, _city, _zip;

    public void setAddress(String street, String city, String zip) {
        this._street = street;
        this._city = city;
        this._zip = zip;
    }

    String getCity() {
        return _city;
    }
}
