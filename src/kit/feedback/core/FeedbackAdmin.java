package kit.feedback.core;

import kit.feedback.institute.User;
import kit.feedback.utility.Questionnaire;

import java.util.List;

public class FeedbackAdmin {
    protected Feedback feedback;

    public FeedbackAdmin(Feedback feedback) {
        this.feedback = feedback;
    }
    public void addQuestionnaire(Questionnaire questionnaire){
        feedback.addQuestionnaire(questionnaire);
    }
    public void addParticipants(List<User> participants){
        feedback.addParticipants(participants);
    }
    public void addRecipients(List<User> recipients){
        feedback.addRecipients(recipients);
    }
}