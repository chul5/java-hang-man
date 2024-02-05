package hangman.view;

public class OutputView {
    private static final String UNDER_BAR = " _";
    public static void getStartMessage(String word) {
        int length = word.length();
        System.out.println("행맨 게임을 시작합니다.");
        System.out.println("제시된 단어는 " + length + "글자 입니다.%n");
        System.out.println("단어 :" + UNDER_BAR.repeat(length));
    }
}
