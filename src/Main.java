public class Main {
    public static void main(String[] args) {
        NumericQuestion question = new NumericQuestion();
        question.setText("What is the value of pi to two decimal places?");
        question.setAnswer(3.14);

        System.out.println(question.getText());
        System.out.println("Response: 3.14 - " + question.checkAnswer("3.14"));
        System.out.println("Response: 3.15 - " + question.checkAnswer("3.15"));
        System.out.println("Response: 3.13 - " + question.checkAnswer("3.13"));
        System.out.println("Response: 3.12 - " + question.checkAnswer("3.12"));
    }
}
