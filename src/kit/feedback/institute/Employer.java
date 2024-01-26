package kit.feedback.institute;

import kit.feedback.utility.Address;

import java.util.Date;

public class Employer extends User{
    private String Company;
    private String designation;

    public Employer(Address address, String name, String email, String mobile, Date dateOfBirth, String company, String designation) {
        super(address, name, email, mobile, dateOfBirth);
        Company = company;
        this.designation = designation;
    }

    public String getCompany() {
        return Company;
    }

    public void updateCompany(String company) {
        Company = company;
    }

    public String getDesignation() {
        return designation;
    }

    public void updateDesignation(String designation) {
        this.designation = designation;
    }
}