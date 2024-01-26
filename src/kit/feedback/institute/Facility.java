package kit.feedback.institute;

import kit.feedback.utility.FacilityType;

public class Facility {
    private FacilityType name;
    private String description;

    public Facility(FacilityType name, String description) {
        this.name = name;
        this.description = description;
    }

    public FacilityType getName() {
        return name;
    }

    public void updateName(FacilityType name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void updateDescription(String description) {
        this.description = description;
    }
}