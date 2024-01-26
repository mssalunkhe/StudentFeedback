package kit.feedback.institute;

import kit.feedback.utility.Semester;

public class StudentToDivisionMap {
    private Student student;
    private Division division;
    Batch batch;
    String academicYear;
    Semester semester;

    public StudentToDivisionMap(Student student, Division division, Batch batch, String academicYear, Semester semester) {
        this.student = student;
        this.division = division;
        this.batch = batch;
        this.academicYear = academicYear;
        this.semester = semester;
    }
}