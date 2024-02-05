package hangman.service;

public class Validator {
    private final int ALPHA = 1;

    public String input(String input) {
        if (input.isEmpty())
            throw new IllegalArgumentException();
        if (input.length() == ALPHA)
            alpha(input);
        return input;
    }
    public void alpha(String input) {
        if (!input.chars()
                .allMatch(i -> 'a' <= i && i <= 'z'))
            throw new IllegalArgumentException();
    }
}
