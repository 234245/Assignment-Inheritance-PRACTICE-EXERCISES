public class ChoiceQuestion extends Question11 {
    private String correctAnswer;

    public ChoiceQuestion(String questionText, String correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void addText(String choice) {
        super.addText(choice); // Add choice using the superclass method
    }

    @Override
    public boolean checkAnswer(String answer) {
        return correctAnswer.equalsIgnoreCase(answer.trim());
    }

    @Override
    public String toString() {

        String result = super.toString();
        result += "Correct Answer: " + correctAnswer + "\n";

        return result;
    }
}
