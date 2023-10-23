package baseball.version2.dto;

import static baseball.version2.constants.Value.ANSWER_ARRAY_SIZE;

public class PlayerAnswerDto {
    int[] answer;

    public PlayerAnswerDto() {
        this.answer = new int[ANSWER_ARRAY_SIZE];
    }

    public int[] getAnswer() {
        return answer;
    }

    public void setAnswer(int[] answer) {
        this.answer = answer;
    }
}
