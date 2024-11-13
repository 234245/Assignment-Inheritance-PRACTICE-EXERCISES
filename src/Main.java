public class Main {
    public static void main(String[] args) {
        Questions question = new Questions();
        question.setText("Who was the inventor of Java?");
        question.setAnswer("James Gosling");

        System.out.println("Question: " + question.getText());
        System.out.println("Response 'James Gosling': " + question.checkAnswer("James Gosling"));
        System.out.println("Response 'JAMES gosling': " + question.checkAnswer("JAMES gosling"));
        System.out.println("Response '  James   Gosling  ': " + question.checkAnswer("  James   Gosling  "));
        System.out.println("Response 'Gosling': " + question.checkAnswer("Gosling")); // Should be false
    }
}
