package baseball;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CompareTest {
    Compare compare;

    @BeforeEach
    void setUp() {
        compare = new Compare();
    }

    @Test
    @DisplayName("몇개의 숫자가 같은지 확인")
    void howMany() {
        assertThat(compare.howMany(Arrays.asList(1,2,3), Arrays.asList(3,1,2))).isEqualTo(3);
    }

    @Test
    @DisplayName("스트라이크 수 확인")
    void countStrike() {
        assertThat(compare.countStrike(Arrays.asList(1,2,3), Arrays.asList(4,1,3))).isEqualTo(1);
    }
}