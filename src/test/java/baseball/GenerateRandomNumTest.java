package baseball;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GenerateRandomNumTest {

    @Test
    @DisplayName("랜덤 숫자 생성 테스트")
    void randomTest(){
        GenerateRandomNum generateRandomNum = new GenerateRandomNum();
        List<Integer> test = generateRandomNum.create();
        Assertions.assertThat(test.size()).isEqualTo(3);
    }

}