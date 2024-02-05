package hangman;

import hangman.controller.GameController;
import hangman.view.InputView;
import hangman.view.OutputView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        GameController gameController = new GameController(inputView, outputView);
        gameController.run();
    }
}