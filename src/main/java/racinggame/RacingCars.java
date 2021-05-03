package racinggame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingCars {

    private List<Car> cars;

    public RacingCars(List<String> carNames){
        this.cars = mapCar(carNames);
    }

    private static List<Car> mapCar(List<String> carNames) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    public int getParticipatedCarCount() {
        return this.cars.size();
    }

    public void racing() {
        for (Car car : this.cars) {
            car.move();
        }
    }
}
