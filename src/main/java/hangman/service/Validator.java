package hangman.service;

public class Validator {
    private static final int ALPHA = 1;

    public static String input(String input) {
        if (input.isEmpty())
            throw new IllegalArgumentException();
        if (input.length() == ALPHA)
            alpha(input);
        return input;
    }
    public static void alpha(String input) {
        if (!input.chars()
                .allMatch(i -> 'a' <= i && i <= 'z'))
            throw new IllegalArgumentException();
    }
}
