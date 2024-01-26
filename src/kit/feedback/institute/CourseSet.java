package kit.feedback.institute;

import kit.feedback.utility.Semester;

import java.util.HashSet;
import java.util.List;
/* A set of courses prescribed for a class of a department for an academic year*/
public class CourseSet {
    private String name ;
    private  String academicYear;
    private Semester semester;
    private HashSet<Course> courses;

    public CourseSet( String name, String academicYear, Semester semester) {
        this.name = name;
        this.academicYear = academicYear;
        this.semester = semester;
    }
    public void addCourse(Course course){
        courses.add(course);
    }



    public String getName() {
        return name;
    }

    public void updateName(String name) {
        this.name = name;
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

    public HashSet<Course> getCourses() {
        return courses;
    }

    public boolean removeCourse(Course course){
        return courses.remove(course);

    }
    public void addCourseList(List<Course> courses){
        this.courses.addAll(courses);
    }
}