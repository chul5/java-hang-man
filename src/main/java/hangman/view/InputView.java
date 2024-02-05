package hangman.view;

import hangman.service.Validator;

import java.util.Scanner;

public class InputView {
    private final Scanner SC = new Scanner(System.in);

    public String getConjecture() {
        System.out.println("유추한 알파벳 또는 단어를 입력해 주세요.");
        return Validator.input(SC.nextLine().trim());
    }
}
