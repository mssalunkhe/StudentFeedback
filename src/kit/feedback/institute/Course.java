package kit.feedback.institute;

import kit.feedback.utility.*;

public class Course {
    private int id;
    private String code;
    private String abbreviation;
    private String name;
    private CourseType type;
    private String description;

    public Course(int id, String code, String abbreviation, String name, CourseType type, String description) {
        this.id = id;
        this.code = code;
        this.abbreviation = abbreviation;
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void updateCode(String code) {
        this.code = code;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void updateAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public CourseType getType() {
        return type;
    }

    public void updateType(CourseType type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void updateId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void updateDescription(String description) {
        this.description = description;
    }
}