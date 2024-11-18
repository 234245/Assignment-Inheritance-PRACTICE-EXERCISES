import java.util.ArrayList;
import java.util.List;

public class Question11 {
    private String questionText;
    private List<String> choices;

    public Question11(String questionText) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Question: ").append(questionText).append("\n");

        if (!choices.isEmpty()) {
            sb.append("Choices:\n");
            for (String choice : choices) {
                sb.append(choice).append("\n");
            }
        }

        return sb.toString();
    }
}
