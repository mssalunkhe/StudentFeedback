package kit.feedback.institute;

import kit.feedback.utility.Semester;

public class DivisionToCourseSetMap {
    private String academicYear;
    private Semester semester;
    private Division division;
    private CourseSet courseSet;

   public DivisionToCourseSetMap(String academicYear, Semester semester, Division division, CourseSet courseSet) {
        this.academicYear = academicYear;
        this.semester = semester;
        this.division = division;
        this.courseSet = courseSet;
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

    public Division getDivision() {
        return division;
    }

    public void updateDivision(Division divisions) {
        this.division = divisions;
    }

    public CourseSet getCourseSet() {
        return courseSet;
    }

    public void updateCourseSet(CourseSet courseSet) {
        this.courseSet = courseSet;
    }
    
}