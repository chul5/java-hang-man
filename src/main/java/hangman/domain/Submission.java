package hangman.domain;

import java.util.ArrayList;
import java.util.List;

public class Submission {
    private final List<String> submission = new ArrayList<>();

    public void validateSubmission(String input) {
        for (String data : submission) {
            if (data.equals(input)) {
                throw new IllegalArgumentException("이미 입력했던 단어임");
            }
        }
        submission.add(input);
    }
}
