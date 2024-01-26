package kit.feedback.institute;

import kit.feedback.repository.DataAccess;
import kit.feedback.repository.DataAddition;

import java.util.HashMap;
import java.util.List;
/* Assignments are down to course level. Batch wise assignments are not there.
Students will select their respective batch teacher while giving feedback. */
public class FacultyToCourseSetAssignment
{
    DivisionToCourseSetMap divisionToCourseSetMap;
    private HashMap<Course,List<Staff>> facultyToCourseMap;

    public FacultyToCourseSetAssignment(DivisionToCourseSetMap divisionToCourseSetMap, HashMap<Course, List<Staff>> facultyToCourseMap) {
        this.divisionToCourseSetMap = divisionToCourseSetMap;
        this.facultyToCourseMap = facultyToCourseMap;
    }

    public void storeMapping(){
       DataAddition.add(divisionToCourseSetMap, facultyToCourseMap);
   }
   public HashMap<Course,Staff> retrieveMapping(){
       return DataAccess.fetchFacultyToCourseMap(divisionToCourseSetMap);
   }

}