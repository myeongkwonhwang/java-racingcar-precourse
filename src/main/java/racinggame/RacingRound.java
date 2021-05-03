package racinggame;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingRound {

    private int round;

    public RacingRound(int round) {
        this.round = round;
    }

    public static RacingRound create(int round){
        return new RacingRound(round);
    }

    public int round() {
        return this.round;
    }

    public void excuteRound() {
        this.round -= 1;
    }
}
