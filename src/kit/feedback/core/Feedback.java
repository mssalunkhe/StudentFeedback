package kit.feedback.core;

import kit.feedback.institute.User;
import kit.feedback.utility.FacilityType;
import kit.feedback.utility.Questionnaire;

import java.util.Date;
import java.util.List;

public class Feedback {
    private int id;
    private String title;
    private Date startDate;
    private Date endDate;
    private FacilityType onFacility;
    private List<User> participants;
    private List<User> recipients;
    private Questionnaire questionnaire;
    private String description;

    public Feedback(String title, Date startDate, Date endDate, FacilityType onFacility, String description) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.onFacility = onFacility;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void updateId(int id) {
        this.id=id;
    }
    public String getTitle() {
        return title;
    }

    public void updateTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void updateStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void updateEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public FacilityType getOnFacility() {
        return onFacility;
    }

    public void updateOnFacility(FacilityType onFacility) {
        this.onFacility = onFacility;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void updateParticipants(List<User> participants) {
        this.participants = participants;
    }

    public List<User> getRecipients() {
        return recipients;
    }

    public void updateRecipients(List<User> recipients) {
        this.recipients = recipients;
    }

    public String getDescription() {
        return description;
    }

    public void updateDescription(String description) {
        this.description = description;
    }

    public void addParticipants(List<User> participants) {
        this.participants = participants;
    }

    public void addRecipients(List<User> recipients) {
        this.recipients = recipients;
    }

    public Questionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void addQuestionnaire(Questionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }
}