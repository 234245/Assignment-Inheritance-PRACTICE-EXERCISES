class NumericQuestion extends Question {
    private double numericAnswer;

    public void setAnswer(double answer) {
        this.numericAnswer = answer;
    }

    @Override
    public boolean checkAnswer(String response) {
        try {
            double responseValue = Double.parseDouble(response);
            // Check if the difference is within the 0.01 margin
            return Math.abs(responseValue - numericAnswer) <= 0.01;
        } catch (NumberFormatException e) {
            System.out.println("Invalid response format. Please enter a numeric value.");
            return false;
        }
    }
}
