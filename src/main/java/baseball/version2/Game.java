package baseball.version2;

import static baseball.version2.Constants.Value.CONTINUE_NUMBER;

import baseball.version2.controller.Controller;

public class Game {

    private final Controller controller;

    public Game() {
        this.controller = new Controller();
    }

    public void run() {
        controller.runGame();
        int continueDecision = CONTINUE_NUMBER;
        while (continueDecision == CONTINUE_NUMBER) {
            int[] computerAnswer = controller.settingGame();
            boolean isCorrect = false;
            while (!isCorrect) {
                isCorrect = controller.startGame(computerAnswer);
            }
            continueDecision = controller.isContinue();
        }
    }
}
