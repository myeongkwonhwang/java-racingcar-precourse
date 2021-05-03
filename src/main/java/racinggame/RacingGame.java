package racinggame;

import ui.RacingRecord;

import java.util.ArrayList;
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
        this.racingRound = RacingRound.create(round);
    }

    public int getJoinedCarCount() {
        return racingCars.getParticipatedCarCount();
    }

    public int getRacingRound() {
        return racingRound.round();
    }

    public void start() {
        while(getRacingRound() != 0){
            nextRound();
            RacingRecord.recode(racing());
        }
        RacingRecord.showResult(getWinner());
    }

    private List<Car> racing() {
        return racingCars.racing();
    }

    private void nextRound() {
        racingRound.excuteRound();
    }

    private String getWinner() {
        List<Car> racingCar = racingCars.getRacingCar();
        int winnerPosition = getWinnerPosition(racingCar);

        return findWinnerCars(racingCar, winnerPosition);
    }

    private int getWinnerPosition(List<Car> racingCar) {
        int max = 0;
        for (Car car : racingCar) {
            max = Math.max(max, car.getPosition());
        }
        return max;
    }

    private String findWinnerCars(List<Car> racingCar, int winnerPosition) {
        List<String> winnerCars = new ArrayList<>();
        for (Car car : racingCar) {
            winnerCars(winnerPosition, winnerCars, car);
        }
        return String.join(", ", winnerCars);
    }

    private void winnerCars(int winnerPosition, List<String> winnerCars, Car car) {
        if(winnerPosition == car.getPosition()){
            winnerCars.add(car.getCarName());
        }
    }

}
