public class Main {
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "C", "D"};

        MultiChoiceQuestion question = new MultiChoiceQuestion(
                "Which of the following options are correct? A, B, C, D",
                correctAnswers
        );

        System.out.println(question.getQuestionText());
        System.out.println(question.getInstructions());

        // Example answers
        String userAnswer = "A C D";
        if (question.checkAnswer(userAnswer)) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer!");
        }
    }
}
