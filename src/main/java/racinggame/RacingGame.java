package racinggame;

import java.util.List;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingGame {

    private RacingCars racingCars;

    public RacingGame(List<String> carNames) {
        this.racingCars = new RacingCars(carNames);
    }

    public int getJoinedCarCount() {
        return racingCars.getParticipatedCarCount();
    }
}
