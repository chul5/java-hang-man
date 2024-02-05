package hangman.controller;

import hangman.domain.Answer;
import hangman.domain.Submission;
import hangman.service.GameService;
import hangman.service.InputHandler;
import hangman.view.InputView;
import hangman.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    private final String WORDS_PATH = "src/resources/words.md";
    private final String HANG_MAN_PATH = "src/resources/hangman.txt";
    private final InputView inputView;
    private final OutputView outputView;
    private Answer answer;
    private Submission submission;
    private GameService gameService;
    private List<String> hint;

    public void run() {
        String conjecture = "";
        int hangManCount = 0;
        int tryCount = 0;
        List<String> hangMan = gameService.getFileData(HANG_MAN_PATH);
        while (!answer.isEqual(conjecture)) {
            tryCount++;
            conjecture = getConjecture();
            if (answer.isContained(conjecture)) {
                gameService.updateHint(conjecture, hint, answer);
                outputView.printCorrect(hint);
            }
            if (!answer.isContained(conjecture))
                outputView.printHangMan(++hangManCount, hangMan);
            if (hangManCount == hangMan.size()) {
                System.out.println("행맨이 완성되었습니다. 게임 실패!");
                return ;
            }
        }
        System.out.println("축하합니다!" + tryCount + "번의 시도 끝에 단어를 맞췄습니다.");
    }

    public String getConjecture() {
        return InputHandler.handle(
                () -> {
                    String input = inputView.getInput();
                    answer.validateInputLength(input);
                    submission.validateSubmission(input);
                    return input;
                }
        );
    }
    public GameController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        gameService = new GameService();
        submission = new Submission();
        List<String> words = gameService.getFileData(WORDS_PATH);
        String selection = gameService.getRandomWord(words);
        hint = gameService.createHint(selection);
        answer = new Answer(selection);
        outputView.printStartMessage(selection);
    }
}
