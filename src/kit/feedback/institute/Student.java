package kit.feedback.institute;

import kit.feedback.core.Feedback;
import kit.feedback.repository.DataAccess;
import kit.feedback.utility.Address;
import kit.feedback.utility.Question;

import java.util.Date;
import java.util.List;

public class Student extends User{
    private String PRN;
    private int yearOfAdmission;

    public Student(Address address, String name, String email, String mobile, Date dateOfBirth, String PRN, int yearOfAdmission, String localAddress) {
        super(address, name, email, mobile, dateOfBirth);
        this.PRN = PRN;
        this.yearOfAdmission = yearOfAdmission;
        this.localAddress = localAddress;
    }

    public String getPRN() {
        return PRN;
    }

    public void updatePRN(String PRN) {
        this.PRN = PRN;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void updateYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getLocalAddress() {
        return localAddress;
    }

    public void updateLocalAddress(String localAddress) {
        this.localAddress = localAddress;
    }

    private String localAddress;
    public List<Feedback> getFeedbackAvailable(){
        List<Feedback> availableFeedbacks =DataAccess.fetchFeedbacks(this);
        return availableFeedbacks;
    }
    public void submitFeedback(Feedback feedback, Course course, Staff staff, List<Question> questions){

    }


}