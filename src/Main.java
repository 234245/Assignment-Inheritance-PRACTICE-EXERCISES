public class Main {
    public static void main(String[] args) {
        AnyCorrectChoiceQuestion question = new AnyCorrectChoiceQuestion();
        question.setText("Name a programming language created by Microsoft.");
        question.setAnswer("C# TypeScript");

        System.out.println("Question: " + question.getText());
        System.out.println("Response 'C#': " + question.checkAnswer("C#"));
        System.out.println("Response 'typescript': " + question.checkAnswer("typescript"));
        System.out.println("Response 'Java': " + question.checkAnswer("Java"));
    }
}
