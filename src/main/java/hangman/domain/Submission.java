package hangman.domain;

import java.util.List;

public class Submission {
    private List<String> submission;

    private void validateSubmission(String input) {
        for (String data : submission) {
            if (data.equals(input)) {
                throw new IllegalArgumentException();
            }
        }
        submission.add(input);
    }
}
