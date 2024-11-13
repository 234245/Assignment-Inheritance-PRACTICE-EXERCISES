class Questions {
    private String text;
    private String answer;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String response) {
        String normalizedAnswer = normalizeString(answer);
        String normalizedResponse = normalizeString(response);
        return normalizedAnswer.equals(normalizedResponse);
    }
    private String normalizeString(String input) {
        return input.toLowerCase().trim().replaceAll("\\s+", " ");
    }
}
