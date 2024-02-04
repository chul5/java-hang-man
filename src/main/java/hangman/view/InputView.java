package hangman.view;

import java.util.Scanner;

public class InputView {
    private static final String UNDER_BAR = " _";
    private static final Scanner SC = new Scanner(System.in);
    public static String getConjecture(String word) {
        int length = word.length();
        System.out.println("행맨 게임을 시작합니다.");
        System.out.println("제시된 단어는 " + length + "글자 입니다.%n");
        System.out.println("단어 :" + UNDER_BAR.repeat(length));
        System.out.println("유추한 알파벳 또는 단어를 입력해 주세요.");
        return SC.nextLine().trim();
    }
}
