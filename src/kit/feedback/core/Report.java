package kit.feedback.core;

import java.util.Date;

public class Report {
    private int feedbackId;
    private String title;
    private Date fromDate;
    private Date toDate;

    public Report(int feedbackId, String title, Date fromDate, Date toDate) {
        this.feedbackId = feedbackId;
        this.title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void updateFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getTitle() {
        return title;
    }

    public void updateTitle(String title) {
        this.title = title;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void updateFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void updateToDate(Date toDate) {
        this.toDate = toDate;
    }
}