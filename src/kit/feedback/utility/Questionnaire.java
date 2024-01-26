package kit.feedback.utility;

import kit.feedback.utility.Question;

import java.util.List;

public class Questionnaire {
    private int id;
    private List<Question> questions;

    public Questionnaire(int id, List<Question> questions) {
        this.id = id;
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public void updateId(int id) {
        this.id = id;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void updateQuestions(List<Question> questions) {
        this.questions = questions;
    }
}