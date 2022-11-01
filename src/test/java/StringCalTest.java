import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCalTest {
  StringCal stringCal;

  @BeforeEach
  public void SetUp(){
    stringCal = new StringCal();
  }

  @Test
  @DisplayName("더하기 테스트")
  void add() {
    assertThat(stringCal.add(1,3)).isEqualTo(4);
  }

  @Test
  void subtract() {
    assertThat(stringCal.subtract(6,2)).isEqualTo(4);
  }

  @Test
  void multiply() {
    assertThat(stringCal.multiply(2,2)).isEqualTo(4);
  }

  @Test
  void divide() {
    assertThat(stringCal.divide(8,0)).isEqualTo(0);
  }

  @Test
  @DisplayName("문자열 나눠주기")
  void seperate() {
    String str = "1 + 3";
    String[] result = {"1" , "+", "3"};
    assertThat(stringCal.seperate(str)).isEqualTo(result);
  }

  @Test
  void toInt() {
    String str = "123";
    assertThat(stringCal.toInt(str)).isEqualTo(123);
  }

  @Test
  void calculateString() {
    String str = "1 + 3 + 5 + 7 + 9";
    String[] result = stringCal.seperate(str);
    int num = 25;
    assertThat(stringCal.calculateString(result)).isEqualTo(num);
  }
}