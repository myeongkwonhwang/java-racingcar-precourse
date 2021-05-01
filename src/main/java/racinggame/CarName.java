package racinggame;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class CarName {

    public static final int MAX_NAME_LENGTH = 5;

    private String name;

    public CarName(String carName) {
        validNameLength(carName);
        this.name = carName;
    }

    public static CarName create(String carName) {
        return new CarName(carName);
    }

    private void validNameLength(String carName) {
        if(carName.length() > MAX_NAME_LENGTH){
            throw new IllegalArgumentException("자동차의 이름은 5자 이하여야 합니다.");
        }
    }

    public String name() {
        return this.name;
    }
}
