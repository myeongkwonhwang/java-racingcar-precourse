package ui;

import racinggame.Car;

import java.util.List;

/**
 * Created by mkhwang on 2021/05/04
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class RacingRecord {

    private static final String ASKING_CARNAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String ASKING_ROUND = "시도할 횟수는 몇회인가요?";
    private static final String RESULT_PREFIX = "실행 결과";
    private static final String DASH = "-";
    private static final String WIN_MESSAGE = "가 최종 우승했습니다.\n";

    public static void startGameMessage() {
        System.out.println(ASKING_CARNAMES);
    }

    public static void inputRoundMessage() {
        System.out.println(ASKING_ROUND);
    }

    public static void resultMessage() {
        System.out.println();
        System.out.println(RESULT_PREFIX);
    }

    public static void recode(List<Car> racingCars) {

        for (Car car : racingCars) {
            printCarResult(car.getCarName(), car.getPosition());
        }
        System.out.println();
    }

    private static void printCarResult(String carName, int position) {
        System.out.println(carName + " : " + positionToString(position));
    }

    public static String positionToString(int position){
        StringBuilder sb = new StringBuilder();
        while (position != 0){
            sb.append(DASH);
            position--;
        }
        return sb.toString();
    }

    public static void showResult(String winnerCars) {
        System.out.println(winnerCars+WIN_MESSAGE);
    }
}
