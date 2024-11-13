public class Main {
    public static void main(String[] args) {
        FillInQuestion question = new FillInQuestion("The inventor of Java was _James Gosling_");

        System.out.println("Question: " + question.getText());
        System.out.println("Response 'James Gosling': " + question.checkAnswer("James Gosling"));
        System.out.println("Response 'James gosling': " + question.checkAnswer("James gosling"));
        System.out.println("Response 'Gosling': " + question.checkAnswer("Gosling"));
    }
}
