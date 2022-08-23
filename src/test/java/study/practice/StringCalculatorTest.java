package study.practice;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class StringCalculatorTest {

  @ParameterizedTest
  @ValueSource(strings = {"1+2", "1*2"})
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
  @CsvSource(value = {"3+5,8", "40+50,90", "100+30+50,180"}, delimiter = ',')
  @DisplayName("덧셈")
  public void plus(String expression, int answer) throws Exception {
    // Given
    int total = 0;
    // When
    String[] numbers = expression.split("\\+");
    for (String number : numbers) {
      total += Integer.parseInt(number);
    }
    // Then
    Assertions.assertThat(total).isEqualTo(answer);
  }

  @ParameterizedTest
  @CsvSource(value = {"40/5,8", "10/50,0.2"}, delimiter = ',')
  @DisplayName("나눗셈")
  public void divide(String expression, float answer) throws Exception {
    // Given

    // When
    String[] numbers = expression.split("/");
    float total = Float.parseFloat(numbers[0]);

    for (int i = 1; i < numbers.length; i++) {
      total /= Float.parseFloat(numbers[i]);
    }
    // Then
    Assertions.assertThat(total).isEqualTo(answer);
  }

  @Test
  @DisplayName("사칙연산")
  public void calculate() throws Exception {
    // Given
    String before = "2 + 3 * 4 / 2";
    // When
    before = before.replace(" ", "");
    List<String> sign = Arrays.asList(before.split("\\d"));
    List<String> numbers = Arrays.asList(before.split("\\D"));

    float answer = Float.parseFloat(numbers.get(0));
    for (int i = 1; i < sign.size(); i++) {
      answer = Operator.calculate(answer, Float.parseFloat(numbers.get(i)), sign.get(i));
    }
    // Then
    assertThat(answer).isEqualTo(10.0f);
  }
}

