package kit.feedback.institute;

import kit.feedback.utility.Address;
import kit.feedback.utility.StaffTye;

import java.util.Date;

public class Staff extends User{
    private int id;
    private StaffTye type;
    private Date dateOfJoining;

    public Staff(Address address, String name, String email, String mobile, Date dateOfBirth, int id, StaffTye type, Date dateOfJoining) {
        super(address, name, email, mobile, dateOfBirth);
        this.id = id;
        this.type = type;
        this.dateOfJoining = dateOfJoining;
    }

    public int getId() {
        return id;
    }

    public void updateId(int id) {
        this.id = id;
    }

    public StaffTye getType() {
        return type;
    }

    public void updateType(StaffTye type) {
        this.type = type;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void updateDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }
}