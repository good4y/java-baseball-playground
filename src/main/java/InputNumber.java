import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class InputNumber {

  public static boolean isValidInput(String input) {
    return input.length() == 3 && isDuplicateNumber(input);
  }

  private static boolean isDuplicateNumber(String input){
    Set<Integer> duplicate = new HashSet<>(convertStringToIntegerList(input));

    return duplicate.size() == 3;
  }

  private static List<Integer> convertStringToIntegerList(String input){

    return Arrays.stream(input.split(""))
        .mapToInt(Integer::parseInt)
        .boxed()
        .collect(Collectors.toList());
  }
}
