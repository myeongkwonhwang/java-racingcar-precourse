package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class CarTest {

    @Test
    @DisplayName(value = "자동차 이름,위치 테스트")
    void newCarTest() {
        Car car = new Car("TEST");
        assertThat(car.getCarName()).isEqualTo("TEST");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @ParameterizedTest(name = "{index} value = {0}")
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9})
    void moveTest(int value) {
        Car car = new Car("명권차");
        car.move(value);
        if(value >= 4){
            assertThat(car.getPosition()).isEqualTo(1);
        }else {
            assertThat(car.getPosition()).isEqualTo(0);
        }
    }
}
