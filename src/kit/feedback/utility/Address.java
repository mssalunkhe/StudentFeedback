package kit.feedback.utility;

public class Address {
    String firstLine;
    String city;
    String state;
    String country;
    String pincode;

    public Address(String firstLine, String city, String state, String country, String pincode) {
        this.firstLine = firstLine;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void updateFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getCity() {
        return city;
    }

    public void updateCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void updateState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void updateCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void updatePincode(String pincode) {
        this.pincode = pincode;
    }
}