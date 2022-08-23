package study;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SetTest {
  private Set<Integer> numbers;

  @BeforeEach
  void setUp(){
    numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
  }

  @Test
  @DisplayName("요구사항 1 - set의 size()를 이용한 크기 구하기")
  public void setSize() throws Exception{
    // Given

    // When
    Integer size = numbers.size();
    // Then
    assertThat(size).isEqualTo(3);
  }

  @DisplayName("요구사항 2 - set의 contains()를 이용한 값 존재 유무 확인")
  @ParameterizedTest
  @ValueSource(ints = {1, 2, 3})
  public void setContains(int number) throws Exception{
    // Given

    // When
      boolean isContains = numbers.contains(number);
    // Then
      assertThat(isContains).isTrue();
  }

  @ParameterizedTest
  @DisplayName("요구사항 3 - contains()를 이용하여 true, false 값 모두 테스트하기")
  @CsvSource(value = {"1,true", "2,true", "3,true", "4,false", "5,false"})
  public void setContainsTrueOrFalse(int number, boolean isTrue) throws Exception{
    // Given

    // When
      boolean isContains = numbers.contains(number);
    // Then
      assertThat(isContains).isEqualTo(isTrue);
  }
}
