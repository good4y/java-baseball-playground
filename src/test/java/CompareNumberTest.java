import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CompareNumberTest {

  @ParameterizedTest
  @CsvSource(value = {"352,2", "642,1", "231,3", "456,0"})
  @DisplayName("볼 체크")
  public void ballCheck(String input, Integer expected) throws Exception {
    // 컴퓨터가 생성한 숫자와 유저에게 받은 숫자를 비교하여 볼이 몇개인지 찾는다.
    // 볼 갯수는 숫자의 위치가 다르지만, 숫자의 값이 같아야 한다.
    // 따라서 숫자의 위치, 숫자의 값이 필요하다.
    List<Integer> number = List.of(1, 2, 3);
    Integer countBall = CompareNumber.countBall(number, input);

    assertThat(countBall).isEqualTo(expected);
  }

  @ParameterizedTest
  @CsvSource(value = {"352,0", "134,1", "126,2", "123,3"})
  @DisplayName("스트라이크 체크")
  public void strikeCheck(String input, Integer expected) throws Exception{
    List<Integer> number = List.of(1, 2, 3);
    Integer countStrike = CompareNumber.countStrike(number, input);

    assertThat(countStrike).isEqualTo(expected);
  }
}
