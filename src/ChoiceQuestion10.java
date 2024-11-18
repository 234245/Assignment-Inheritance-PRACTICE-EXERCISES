public class ChoiceQuestion10 extends Question10 {
    private String correctAnswer;

    public ChoiceQuestion10(String questionText, String correctAnswer) {
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
}
