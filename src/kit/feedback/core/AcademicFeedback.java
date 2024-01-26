package kit.feedback.core;

import kit.feedback.utility.FacilityType;
import kit.feedback.utility.Semester;

import java.util.Date;

public class AcademicFeedback extends Feedback{
    private String academicYear;
    private Semester semester;//odd or even

    public AcademicFeedback(String title, Date startDate, Date endDate, FacilityType onFacility, String description, String academicYear, Semester semester) {
        super(title, startDate, endDate, onFacility, description);
        this.academicYear = academicYear;
        this.semester = semester;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void updateAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Semester getSemester() {
        return semester;
    }

    public void updateSemester(Semester semester) {
        this.semester = semester;

    }

}