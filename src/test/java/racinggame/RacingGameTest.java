package racinggame;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingGameTest {

    @Test
    @DisplayName(value = "입력한 자동차 이름만큼 자동차 생성")
    void inputCarNames_ReturnCarsLength() {
        RacingGame racingGame = new RacingGame(Arrays.asList("hwang", "mk", "kwon"), 5);
        int joinedCarCount = racingGame.getJoinedCarCount();
        assertThat(3).isEqualTo(joinedCarCount);
    }

    @Test
    @DisplayName(value = "입력한 자동차 이름만큼 자동차 생성과 라운드 테스트")
    void inputCarNamesAndRoundTest() {
        RacingGame racingGame = new RacingGame(Arrays.asList("hwang", "mk", "kwon"), 5);
        int joinedCarCount = racingGame.getJoinedCarCount();
        int racingRound = racingGame.getRacingRound();
        assertThat(3).isEqualTo(joinedCarCount);
        assertThat(5).isEqualTo(racingRound);
    }

    @Test
    @DisplayName(value = "라운드 진행 테스트")
    void nextRoundTest() {
        RacingGame racingGame = new RacingGame(Arrays.asList("hwang", "mk", "kwon"), 5);
        assertThat(5).isEqualTo(racingGame.getRacingRound());
        racingGame.round();
        assertThat(4).isEqualTo(racingGame.getRacingRound());
    }
}
