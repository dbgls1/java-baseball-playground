package baseball;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CompareNumTest {

    @Test
    public void 숫자비교테스트(){
        CompareNum compareNum = new CompareNum();
        String result = compareNum.isContainNum(Arrays.asList(1, 2, 3), Arrays.asList(1, 3, 2));
        Assertions.assertThat(result).isEqualTo("2 ball 1 strike");
    }

}