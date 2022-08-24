import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareNumber {

  public static Integer countBall(List<Integer> number, String input) {
    List<Integer> inputNumber = convertStringToIntegerList(input);
    int ball = 0;

    for (int i = 0; i < inputNumber.size(); i++) {
      for (int j = 0; j < inputNumber.size(); j++) {
        if (inputNumber.get(j).equals(number.get(i)) && i != j) {
          ball++;
        }
      }
    }

    return ball;
  }

  public static Integer countStrike(List<Integer> number, String input) {
    List<Integer> inputNumber = convertStringToIntegerList(input);
    int strike = 0;

    for (int i = 0; i < inputNumber.size(); i++) {
      if (inputNumber.get(i).equals(number.get(i))) {
        strike++;
      }
    }
    return strike;
  }

  private static List<Integer> convertStringToIntegerList(String input) {

    return Arrays.stream(input.split(""))
        .mapToInt(Integer::parseInt)
        .boxed()
        .collect(Collectors.toList());
  }
}
