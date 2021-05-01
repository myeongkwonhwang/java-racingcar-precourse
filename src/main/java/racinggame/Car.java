package racinggame;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class Car {

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
}
