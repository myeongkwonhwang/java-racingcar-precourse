package racinggame;

import java.util.Random;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class Car {

    public static final int RANDOM_MAX = 9;

    private CarName carName;
    private CarPosition carPosition;

    public Car(String carName) {
        this.carName = CarName.create(carName);
        this.carPosition = CarPosition.create();
    }

    public String getCarName() {
        return this.carName.name();
    }

    public int getPosition() {
        return this.carPosition.position();
    }

    public int move() {
        return this.carPosition.movePosition(generateRandomNumber());
    }

    private int generateRandomNumber() {
        return new Random().nextInt(RANDOM_MAX + 1);
    }
}
