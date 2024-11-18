import java.util.HashSet;
import java.util.Set;

public class MultiChoiceQuestion extends Question9 {
    private Set<String> correctAnswers;

    public MultiChoiceQuestion(String questionText, String[] correctAnswers) {
        super(questionText);
        this.correctAnswers = new HashSet<>();
        for (String answer : correctAnswers) {
            this.correctAnswers.add(answer.trim().toLowerCase());
        }
    }

    @Override
    public boolean checkAnswer(String answer) {
        // Convert answer to lowercase and split by spaces to check each answer
        String[] userAnswers = answer.trim().toLowerCase().split("\\s+");
        Set<String> userAnswerSet = new HashSet<>();

        for (String ans : userAnswers) {
            userAnswerSet.add(ans);
        }

        // Check if the user's answers match the correct answers
        return userAnswerSet.equals(correctAnswers);
    }

    public String getInstructions() {
        return "Please provide all correct answers separated by spaces.";
    }
}
