package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    @Test //요구사항1
    void split(){
        //contain(), containOnly(), containExactly() 차이
        //split(String), split(String, int) 차이

        String[] actual1 = "1,2".split(",");
        assertThat(actual1).containsExactly("1", "2");
        String[] actual2 = "1".split(",");
        assertThat(actual2).contains("1");
    }
    @Test //요구사항2
    void substring(){
        //substring(int), substring(int, int) 차이

        String s = "(1,2)";
        int n = s.length();

        String actual = s.substring(1, n - 1);
        assertThat(actual).isEqualTo("1,2");
    }
    @Test //요구사항3
    @DisplayName("입력값 범위 밖일 경우 StringIndexBoundsException 확인")
    void charAt(){
        //given
        String s = "abc";

        //when, then
        assertThatThrownBy( ()-> s.charAt(s.length()) )
            .isInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessageContaining("index out of range")
            .hasMessageContaining(String.valueOf(s.length()));

        //혹은
/*        assertThatExceptionOfType(StringIndexOutOfBoundsException.class)
            .isThrownBy(() -> s.charAt(s.length()) )
            .withMessageContaining("String index out of range")
            .withMessageContaining(String.valueOf(s.length()));*/
    }

}
