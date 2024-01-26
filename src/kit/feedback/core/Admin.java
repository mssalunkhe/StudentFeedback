package kit.feedback.core;


import kit.feedback.institute.*;
import kit.feedback.institute.Class;
import kit.feedback.repository.DataAccess;
import kit.feedback.repository.DataAddition;
import kit.feedback.repository.DataUpdate;
import kit.feedback.utility.Address;
import kit.feedback.utility.FacilityType;

import java.util.Date;
import java.util.List;

public class Admin extends User {
    public Admin(Address address, String name, String email, String mobile, Date dateOfBirth) {
        super(address, name, email, mobile, dateOfBirth);
    }

    public boolean addDepartment(Department dept) {
        return kit.feedback.repository.DataAddition.addDepartment(dept);
    }

    public boolean addClass(Class cls) {
        return kit.feedback.repository.DataAddition.addClass(cls);
    }

    public boolean addDivision(Division division) {
        return kit.feedback.repository.DataAddition.addDivision(division);
    }
    public boolean addBatch(Batch batch){
        return kit.feedback.repository.DataAddition.addBatch(batch);
    }
    public boolean addCourse(Course course){
        return kit.feedback.repository.DataAddition.addCourse(course);
    }
    public boolean addStaff(Staff staff){
        return kit.feedback.repository.DataAddition.addStaff(staff);
    }
    public Feedback createFeedback(String title, Date startDate, Date endDate, FacilityType onFacility, String description){
        Feedback feedback=new Feedback( title, startDate, endDate, onFacility,description);
        DataAddition.add(feedback);
        return feedback;

    }
    public boolean updateFeedback(Feedback feedback){
        return DataUpdate.save(feedback);
    }
    public List<Feedback> getFeedbacks(){
        return DataAccess.fetchFeedbacks();
    }
}