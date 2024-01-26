package kit.feedback.institute;

public class Department {
    private String name;
    private String abbreviation;
    private String description;

    public Department(String name, String abbreviation, String description) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getDescription() {
        return description;
    }

    public void updateName(String name) {
        this.name= name;
    }

    public void updateAbbreviation(String abbreviation) {
        this.abbreviation=abbreviation;
    }

    public void updateDescription(String description) {
        this.description=description;
    }
}