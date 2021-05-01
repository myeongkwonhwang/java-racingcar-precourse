package racinggame;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class Car {

    private CarName carName;

    public Car(String carName) {
        this.carName = new CarName(carName);
    }

    public String getCarName() {
        return carName.getName();
    }
}
