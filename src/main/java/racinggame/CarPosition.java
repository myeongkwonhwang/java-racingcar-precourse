package racinggame;


/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class CarPosition {

    public static final int START_POSITION = 0;
    public static final int GO_MOVE_VALUE = 4;

    private int position;

    public CarPosition() {
        this.position = START_POSITION;
    }

    public static CarPosition create(){
        return new CarPosition();
    }

    public int position() {
        return this.position;
    }

    public int movePosition(int value) {
        if(value >= GO_MOVE_VALUE){
            this.position++;
        }
        return this.position;
    }
}
