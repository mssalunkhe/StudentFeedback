package kit.feedback.institute;

import kit.feedback.utility.Address;
import kit.feedback.utility.Relationship;

import java.util.Date;

public class Parent extends User{
    private String PRNOfWard;
    private Relationship relationWithWard;

    public Parent(Address address, String name, String email, String mobile, Date dateOfBirth, String PRNOfWard, Relationship relationWithWard) {
        super(address, name, email, mobile, dateOfBirth);
        this.PRNOfWard = PRNOfWard;
        this.relationWithWard = relationWithWard;
    }

    public String getPRNOfWard() {
        return PRNOfWard;
    }

    public void updatePRNOfWard(String PRNOfWard) {
        this.PRNOfWard = PRNOfWard;
    }

    public Relationship getRelationWithWard() {
        return relationWithWard;
    }

    public void updateRelationWithWard(Relationship relationWithWard) {
        this.relationWithWard = relationWithWard;
    }
}