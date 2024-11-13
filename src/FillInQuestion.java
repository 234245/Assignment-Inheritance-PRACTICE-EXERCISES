class FillInQuestion extends Question {
    public FillInQuestion(String questionText) {
        setFillInQuestion(questionText);
    }
    private void setFillInQuestion(String questionText) {
        int start = questionText.indexOf('_');
        int end = questionText.lastIndexOf('_');

        if (start != -1 && end != -1 && start < end) {

            String answer = questionText.substring(start + 1, end);
            setAnswer(answer);
            String displayText = questionText.substring(0, start) + "_____"
                    + questionText.substring(end + 1);
            setText(displayText);
        } else {

            setText(questionText);
        }
    }
}
