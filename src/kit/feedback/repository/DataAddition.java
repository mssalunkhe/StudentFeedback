package kit.feedback.repository;

import kit.feedback.institute.Course;
import kit.feedback.institute.DivisionToCourseSetMap;
import kit.feedback.core.Feedback;
import kit.feedback.institute.*;
import kit.feedback.institute.Class;
import kit.feedback.utility.Semester;

import java.util.HashMap;
import java.util.List;

public class DataAddition {
    public static boolean addDepartment(Department dept) {
        return false;
    }


    public static boolean addClass(Class cls) {
        return false;
    }

    public static boolean addDivision(Division division) {
        return false;
    }

    public static boolean addBatch(Batch batch) {
        return false;
    }

    public static boolean addCourse(Course course) {
        return false;
    }

    public static boolean addStaff(Staff staff) {
        return false;
    }

    public static boolean add(Feedback feedback) {
        return  false;
    }

    public static boolean add(DivisionToCourseSetMap divisionToCourseSetMap, HashMap<Course, List<Staff>> courseSetToFacultyMap) {
        return false;
    }

    public static boolean add(String academicYear, Semester semester, List<Student> students, Division division) {
    }

    public static void add(Feedback feedback, List<Student> students) {
    }
}