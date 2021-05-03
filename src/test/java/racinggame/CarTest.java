package racinggame;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class CarTest {

    @Test
    @DisplayName(value = "자동차 이름,위치 테스트")
    void newCarNameTest() {
        Car car = new Car("TEST");
        assertThat(car.getCarName()).isEqualTo("TEST");
    }

    @Test
    @DisplayName(value = "자동차 위치 테스트")
    void newCarPositionTest() {
        Car car = new Car("TEST");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @DisplayName(value = "자동차 이동 테스트")
    @ParameterizedTest(name = "{index} value = {0}")
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9})
    @Disabled
    void moveTest(int value) {
        Car car = new Car("명권차");

        if(value >= 4){
            assertThat(car.getCarName()).isEqualTo("명권차");
            //assertThat(car.move(value)).isEqualTo(1);
            assertThat(car.getPosition()).isEqualTo(1);
        }else {
            assertThat(car.getCarName()).isEqualTo("명권차");
            //assertThat(car.move(value)).isEqualTo(0);
            assertThat(car.getPosition()).isEqualTo(0);
        }
    }

    @DisplayName(value = "자동차 이동시 0-9 랜덤값 테스트")
    @RepeatedTest(value = 10)
    @Disabled
    void randomTest(){
        Car car = new Car("명권");
        /*
        난수 발생 테스트 완료 후 move에서 호출하도록 변경.
        int number = car.generateRandomNumber();
        assertAll(
                () -> assertThat(number).isGreaterThanOrEqualTo(0),
                () -> assertThat(number).isLessThanOrEqualTo(9)
        );
        */
    }
}
