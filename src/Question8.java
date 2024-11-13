import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Question {
    private String text;
    private String answer;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        return normalizeString(response).equals(normalizeString(answer));
    }

    // Helper method to normalize strings by converting to lowercase and removing extra spaces
    protected String normalizeString(String input) {
        return input.toLowerCase().trim().replaceAll("\\s+", " ");
    }
}

class AnyCorrectChoiceQuestion extends Question {
    private List<String> correctChoices;

    public AnyCorrectChoiceQuestion() {
        this.correctChoices = new ArrayList<>();
    }

    @Override
    public void setText(String text) {
        super.setText(text + " (Enter any one of the correct choices.)");
    }

    @Override
    public void setAnswer(String answer) {
        correctChoices = Arrays.asList(answer.toLowerCase().split("\\s+"));
    }

    @Override
    public boolean checkAnswer(String response) {
        String normalizedResponse = normalizeString(response);
        for (String choice : correctChoices) {
            if (normalizedResponse.equals(choice)) {
                return true;
            }
        }
        return false;
    }
}
