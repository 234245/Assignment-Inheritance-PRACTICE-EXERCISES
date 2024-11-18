public class Main {
    public static void main(String[] args) {

        ChoiceQuestion question11 = new ChoiceQuestion(
                "Which of the following is the capital of France?", "Paris"
        );

        // Add choices using the addText method
        question11.addText("Berlin");
        question11.addText("Madrid");
        question11.addText("Paris");
        question11.addText("Rome");
        System.out.println(question11.toString());

        // Example answers
        String userAnswer = "Paris";

        // Check if the user's answer is correct
        if (question11.checkAnswer(userAnswer)) {
            System.out.println("Correct answer!");
        } else {
            System.out.println("Incorrect answer!");
        }
    }
}
