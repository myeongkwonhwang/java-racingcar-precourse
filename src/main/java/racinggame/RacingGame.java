package racinggame;

import java.util.List;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingGame {

    private RacingCars racingCars;
    private RacingRound racingRound;

    public RacingGame(List<String> carNames, int round) {
        this.racingCars = new RacingCars(carNames);
        this.racingRound = new RacingRound(round);
    }

    public int getJoinedCarCount() {
        return racingCars.getParticipatedCarCount();
    }

    public int getRacingRound() {
        return this.racingRound.round();
    }
}
