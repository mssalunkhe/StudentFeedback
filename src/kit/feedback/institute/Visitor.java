package kit.feedback.institute;

import kit.feedback.utility.Address;
import kit.feedback.utility.VisitorTye;

import java.util.Date;

public class Visitor extends User {
    private VisitorTye type;
    private String city;
    private String institute;



    public Visitor(Address address, String name, String email, String mobile, Date dateOfBirth, VisitorTye type, String city, String institute) {
        super(address, name, email, mobile, dateOfBirth);
        this.type = type;
        this.city = city;
        this.institute = institute;
    }

    public VisitorTye getType() {
        return type;
    }

    public void updateTYPE(VisitorTye type) {
        this.type = type;
    }
}