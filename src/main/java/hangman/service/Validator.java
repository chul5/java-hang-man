package hangman.service;

public class Validator {
    public void word(String input) {
        if (input.isEmpty())
            throw new IllegalArgumentException();
        if (!input.chars()
                .allMatch(i -> 'a' <= i && i <= 'z'))
            throw new IllegalArgumentException();

    }
}
