import java.util.ArrayList;
import java.util.List;

public class Question10{
    private String questionText;
    private List<String> choices;

    public Question10(String questionText) {
        this.questionText = questionText;
        this.choices = new ArrayList<>();
    }

    // Method to add choices dynamically
    public void addText(String choice) {
        choices.add(choice);
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getChoices() {
        return choices;
    }

    // Method to be overridden in child classes
    public boolean checkAnswer(String answer) {
        return false;
    }
}
