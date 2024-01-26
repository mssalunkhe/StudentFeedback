package kit.feedback.core;

public class ReportGenerator {
    private int feedbackID;

    public ReportGenerator(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void updateFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }
    public void consolidatedReport(){

    }

}