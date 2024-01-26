package kit.feedback.core;

import kit.feedback.institute.*;
import kit.feedback.institute.Class;
import kit.feedback.repository.DataAddition;
import kit.feedback.repository.DataUpdate;
import kit.feedback.utility.Semester;

import java.util.HashMap;
import java.util.List;

public class AcademicFeedbackAdmin extends FeedbackAdmin {
    AcademicFeedback academicFeedback;
    Department department;


    public AcademicFeedbackAdmin(AcademicFeedback academicFeedback, Department department) {
        super(academicFeedback);
        this.academicFeedback = academicFeedback;
    }
    public void assignFacultyToCourse(String academicYear, Semester semester, Division myDivision, HashMap<Course, List<Staff>> assignments){
        CourseSet courseSet=new CourseSet("",academicYear,semester);
        for (Course course:assignments.keySet()
             ) {
            courseSet.addCourse(course);
        }
        DivisionToCourseSetMap divisionToCourseSetMap= new DivisionToCourseSetMap(academicYear,semester,myDivision,courseSet);
        FacultyToCourseSetAssignment facultyToCourseSetAssignment = new FacultyToCourseSetAssignment(divisionToCourseSetMap,assignments);
        facultyToCourseSetAssignment.storeMapping();
    }
    public void updateFacToCourseAssignment(String academicYear, Semester semester, Class myClass, Division myDivision, Course course, Staff staff){
        DataUpdate.save(academicYear,semester,myClass,myDivision,course,staff);
    }
    public void mapStudentToDivision(List<Student> students, String academicYear, Semester semester, Division division, Batch batch){
        DataAddition.add(academicYear, semester,students,division);
    }
    public void enrolStudentsToFeedback(List<Student> students){
        DataAddition.add(feedback,students);
    }
}