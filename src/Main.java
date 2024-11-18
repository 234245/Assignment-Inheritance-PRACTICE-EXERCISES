public class Main {
    public static void main(String[] args) {
        // Create a new ChoiceQuestion
        ChoiceQuestion10 question = new ChoiceQuestion10(
                "Which of the following is the capital of France?", "Paris"
        );

        // Add choices using the addText method
        question.addText("Berlin");
        question.addText("Madrid");
        question.addText("Paris");
        question.addText("Rome");

        // Print the question and the available choices
        System.out.println(question.getQuestionText());
        System.out.println("Choices:");
        for (String choice : question.getChoices()) {
            System.out.println(choice);
        }

        // Example answers
        String userAnswer = "Paris";

        // Check if the user's answer is correct
        if (question.checkAnswer(userAnswer)) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer!");
        }
    }
}
