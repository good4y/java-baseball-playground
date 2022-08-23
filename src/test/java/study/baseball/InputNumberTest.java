package study.baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

/*
  1 ~ 9 까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임.

  같은 수가 같은 자리 - 스트라이크
  다른자리 - 볼
  전혀 같은 수가 없으면 - 포볼
  ex) input : 123, answer : 126 => 2 스트라이크
  ex) input : 123, answer : 312 => 3 볼
 */

public class InputNumberTest {
  @ParameterizedTest
  @ValueSource(strings = {"132", "162"})
  @DisplayName("문자열 받기")
  public void inputString(String input) throws Exception {
    // Given
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    Scanner scan = new Scanner(System.in);
    String before = "";
    // When
    before = scan.nextLine();
    // Then
    assertThat(before).isEqualTo(input);
  }

  @ParameterizedTest
  @CsvSource(value = {"123,true", "12512,false", "000,false"})
  @DisplayName("받은 문자열 확인")
  public void inputStringValidation(String input, boolean isTrue) throws Exception{
    // Given
    String regex = "([1-9]{3})";
    // When
    Boolean matches = input.matches(regex);
    // Then
    Assertions.assertThat(matches).isEqualTo(isTrue);
  }
}
