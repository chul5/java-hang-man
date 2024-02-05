package hangman.domain;

import java.util.List;

public class Answer {
    private String answer;

    public Answer(String input) {
        answer = input;
    }

    public void validateInputLength(String input) {
        if (answer.length() != input.length())
            throw new IllegalArgumentException();
    }

    public boolean isContained(String input) {
        return answer.contains(input);
    }

    public boolean isEqual(String input) {
        return answer.equals(input);
    }

    public int getIndex(String input, int index) {
        return answer.indexOf(input, index);
    }
}
