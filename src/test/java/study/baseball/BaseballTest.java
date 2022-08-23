package study.baseball;

import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BaseballTest {

  @Test
  @DisplayName("볼 찾기")
  public void findBall() throws Exception{
    // Given
    String input = "123";
    String answer = "513";

    int strikeCount = 0;
    int ballCount = 0;
    // When
    List<String> inputNumber = Arrays.asList(input.split(""));

    for(int i = 0; i < 3; i++){
      if(input.charAt(i) == answer.charAt(i)) {
        strikeCount++;
        continue;
      }
      if(answer.contains(inputNumber.get(i))){
        ballCount++;
      }
    }

    // Then
    Assertions.assertThat(strikeCount).isEqualTo(1);
    Assertions.assertThat(ballCount).isEqualTo(1);
  }

  @Test
  @DisplayName("스트라이크 찾기")
  public void findStrike() throws Exception{
    // Given
    String input = "123";
    String answer = "513";

    int strikeCount = 0;
    // When
    for(int i = 0; i < 3; i++){
      if(input.charAt(i) == answer.charAt(i)) {
        strikeCount++;
      }
    }

    // Then
    Assertions.assertThat(strikeCount).isEqualTo(1);
  }
}
