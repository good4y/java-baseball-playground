import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RandomNumberGeneratorTest {

  @RepeatedTest(value = 20)
  @DisplayName("중복되지 않은 랜덤 숫자 생성")
  public void random() throws Exception{
    RandomNumber randomNumber = new RandomNumber();

    assertThat(randomNumber.getNumber().size()).isEqualTo(3);
  }


}
