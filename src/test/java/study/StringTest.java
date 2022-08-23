package study;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("요구사항 1_1 - split을 이용하여 1과 2로 분리되는 배열 생성")
    public void splitString1() throws Exception{
      // Given
        String before = "1,2";
      // When
        List<String> after = Arrays.asList(before.split(","));
      // Then
        // containsExactly 메소드의 경우 배열에 포함된 모든 값이 정확히 들어가있어야 한다.
        // contains 메소드의 경우 배열 내에서 검증하고자 하는 값만 체크 할 수 있다.
        assertThat(after).containsExactly("1", "2");
    }

    @Test
    @DisplayName("요구사항 1_2 - 1을 ,로 split 시 1만 포함 하는 배열 생성")
    public void splitString2() throws Exception{
      // Given
        String before = "1";
      // When
        List<String> after = Arrays.asList(before.split(","));
      // Then
        assertThat(after).containsExactly("1");
    }

    @Test
    @DisplayName("요구사항 2 - substring을 이용하여 괄호 잘라내기")
    public void substring() throws Exception{
      // Given
        String before = "(1,2)";
      // When
        String after = before.substring(1, before.length() - 1);
      // Then
        assertThat(after).isEqualTo("1,2");
    }

    @Test
    @DisplayName("요구사항 3_1 - charAt() 특정 위치의 문자 가져오기")
    public void charAt() throws Exception{
      // Given
        String before = "abc";
      // When
        Character after = before.charAt(1);
      // Then
        assertThat(after).isEqualTo('b');
    }

    @Test
    @DisplayName("요구사항 3_2 - charAt() 메소드 사용 시 예외 발생 테스트하기")
    public void charAtException() throws Exception{
      // Given
        String before = "abc";
      // When

      // Then
        assertThatExceptionOfType(IndexOutOfBoundsException.class)
            .isThrownBy(() -> before.charAt(99)).withMessageMatching("String index out of range: 99");
    }
}
