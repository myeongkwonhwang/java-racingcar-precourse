package racinggame;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class CarPosition {

    private int position;

    public CarPosition() {
        this.position = 0;
    }

    public static CarPosition create(){
        return new CarPosition();
    }

    public int position() {
        return this.position;
    }
}
