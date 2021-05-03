import racinggame.RacingGame;
import ui.RacingInput;
import ui.RacingRecord;

/**
 * Created by mkhwang on 2021/05/04
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingGameApplication {
    public static void main(String[] args) {

        RacingInput racingInput = new RacingInput();
        racingInput.init();
        RacingRecord.resultMessage();

        RacingGame racingGame = new RacingGame(racingInput.getCarNames(), racingInput.getRound());
        racingGame.start();



    }
}
