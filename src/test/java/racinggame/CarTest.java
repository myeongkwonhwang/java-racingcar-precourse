package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
