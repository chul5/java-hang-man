package hangman.view;

import java.util.List;
import java.util.stream.IntStream;

public class OutputView {
    private final String UNDER_BAR = " _";
    private List<String> hint;
    public void printStartMessage(String word) {
        int length = word.length();
        System.out.println("행맨 게임을 시작합니다.");
        System.out.println("제시된 단어는 " + length + "글자 입니다.%n");
        System.out.println("단어 :" + UNDER_BAR.repeat(length));
    }

    public void printHangMan(int count, List<String> hangMan) {
        System.out.println("오답입니다.");
        hangMan.stream()
                .limit(count)
                .forEach(System.out::println);
    }

    public void printCorrect(List<String> hints) {
        StringBuilder correct = new StringBuilder("단어 :");
        System.out.println("정답입니다.");
        for (String hint : hints) {
            correct.append(hint);
        }
        System.out.println(correct);
    }
}
