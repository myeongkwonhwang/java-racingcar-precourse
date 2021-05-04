package ui;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by mkhwang on 2021/05/04
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingInput {

    private List<String> carNames;
    private int round;

    public void init() {
        Scanner sc = new Scanner(System.in);
        RacingRecord.startGameMessage();
        this.carNames = Arrays.asList(sc.nextLine().trim().split(","));
        RacingRecord.inputRoundMessage();
        this.round = sc.nextInt();
    }

    public int getRound() {
        return round;
    }

    public List<String> getCarNames() {
        return carNames;
    }
}
