package racinggame;

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
        RacingGame racingGame = new RacingGame(Arrays.asList("hwang", "myeong", "kwon"));
        int joinedCarCount = racingGame.getJoinedCarCount();
        assertThat(3).isEqualTo(joinedCarCount);
    }
}
