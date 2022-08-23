import java.util.HashSet;
import java.util.Random;

public class RandomAnswer {
  public static String randomNumber(){
    StringBuilder answer = new StringBuilder();
    HashSet<Integer> number = new HashSet<>();

    while(number.size() < 3){
      int ans = new Random().nextInt(8)+1;
      number.add(ans);
    }

    for (Integer integer : number) {
      answer.append(integer);
    }

    return answer.toString();
  }
}
