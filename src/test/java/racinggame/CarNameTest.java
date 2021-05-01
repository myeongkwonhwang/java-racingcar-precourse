package racinggame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by mkhwang on 2021/05/02
 * Email : orange2652@gmail.com
 * Github : https://github.com/myeongkwonhwang
 */
public class CarNameTest {

    @Test
    @DisplayName(value = "자동차이름 다섯글자 초과 테스트")
    void carNameMaxLengthGreaterThanTest() {
        assertThatIllegalArgumentException().isThrownBy(() -> new CarName("다섯글자초과")).withMessageMatching("자동차의 이름은 5자 이하여야 합니다.");
    }

    @Test
    @DisplayName(value = "자동차이름 다섯글자 테스트")
    void carNameMaxLengthLessthanOrEqualTest() {
        CarName carName = new CarName("다섯글자다");
        assertThat("다섯글자다").isEqualTo(carName.getName());
    }
}
