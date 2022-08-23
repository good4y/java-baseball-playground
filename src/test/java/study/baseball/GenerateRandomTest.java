package study.baseball;

import java.util.HashSet;
import java.util.Random;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GenerateRandomTest {
  @Test
  @DisplayName("랜덤 수 만들기")
  public void random() throws Exception{
    StringBuilder answer = new StringBuilder();
    HashSet<Integer> number = new HashSet<>();

    while(number.size() < 3){
      int ans = new Random().nextInt(8)+1;
      number.add(ans);
    }

    for (Integer integer : number) {
      answer.append(integer);
    }
    System.out.println(answer);
  }

}
