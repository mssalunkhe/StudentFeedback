package kit.feedback.repository;

import kit.feedback.institute.Course;
import kit.feedback.institute.DivisionToCourseSetMap;
import kit.feedback.core.Feedback;
import kit.feedback.institute.Staff;
import kit.feedback.institute.Student;
import kit.feedback.utility.Menu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DataAccess {

    public static List<Menu> fetchMenu() {
        return Arrays.stream(Menu.values()).toList();
    }

    public static HashMap<Course, Staff> fetch(DivisionToCourseSetMap divisionToCourseSetMap) {
        HashMap<Course,Staff> map;
        return map;
    }

    public static List<Feedback> fetchFeedbacks(Student student) {
        List<Feedback> feedbacks;
        return feedbacks;
    }

    public static HashMap<Course, Staff> fetchFacultyToCourseMap(DivisionToCourseSetMap divisionToCourseSetMap) {
    }

    public static List<Feedback> fetchFeedbacks() {
    }
}