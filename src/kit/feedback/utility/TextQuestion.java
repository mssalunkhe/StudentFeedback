package kit.feedback.utility;

public class TextQuestion extends Question{
    private String answer;

    public TextQuestion(int id, String text, QuestionType type, String answer) {
        super(id, text, type);
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}