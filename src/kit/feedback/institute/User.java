package kit.feedback.institute;

import kit.feedback.utility.*;

import java.util.Date;

public abstract class User {


    private long userID;
    private Address address;
    private String name;
    private String email;
    private String mobile;
    private Date dateOfBirth;

    public User(Address address, String name, String email, String mobile, Date dateOfBirth) {
        this.address = address;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void updateAddress(Address address) {
        this.address = address;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void updateMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void updateDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }


}