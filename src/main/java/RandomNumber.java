import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumber {

  private final List<Integer> number;

  public RandomNumber() {
    this.number = randomList();
  }

  public List<Integer> getNumber() {
    return number;
  }

  private static Integer randomNumberGenerator() {
    return new Random().nextInt(9) + 1;
  }

  private static List<Integer> randomList() {
    return IntStream.generate(RandomNumber::randomNumberGenerator)
        .distinct()
        .limit(3)
        .collect(ArrayList::new, List::add, List::addAll);
  }
}
