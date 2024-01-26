package kit.feedback.institute;

import java.util.List;

public class Division {
    Department department;
    Class myClass;
    private String name;
    private String description;
    List<Batch> batches;

    public Division(Department department, Class myClass, String name, String description, List<Batch> batches) {
        this.department = department;
        this.myClass = myClass;
        this.name = name;
        this.description = description;
        this.batches = batches;
    }

    public Department getDepartment() {
        return department;
    }

    public void updateDepartment(Department department) {
        this.department = department;
    }

    public Class getMyClass() {
        return myClass;
    }

    public void updateMyClass(Class myClass) {
        this.myClass = myClass;
    }

    public List<Batch> getBatches() {
        return batches;
    }

    public void updateBatches(List<Batch> batches) {
        this.batches = batches;
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