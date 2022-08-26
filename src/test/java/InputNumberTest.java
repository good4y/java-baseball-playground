import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class InputNumberTest {

  @ParameterizedTest
  @CsvSource(value = {"123,true", "144,false", "222,false", "1245,false"})
  @DisplayName("입력된 숫자 유효성 체크 - 3자리, 중복 없는 숫자")
  public void inputNumberValidation(String input, boolean isValid) throws Exception{
    boolean isTrue = InputNumber.isValidInput(input);

    Assertions.assertThat(isTrue).isEqualTo(isValid);

  }

  @Test
  @DisplayName("문자열 중복 HashSet")
  public void dup() throws Exception{

    List<Integer> inputArray = new ArrayList<>(Arrays.asList(1, 3, 3));
    Set<Integer> dup1 = new HashSet<>(inputArray);

    Assertions.assertThat(dup1.size()).isNotEqualTo(3);
  }
}
