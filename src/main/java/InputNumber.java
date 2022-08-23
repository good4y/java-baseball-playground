import java.util.Scanner;

public class InputNumber {

  private final String input;

  public InputNumber(String input){
    this.input = inputValidation(input);;
  }

  private static String inputValidation(String input) {
    String regex = "([1-9]{3})";
    boolean matches = input.matches(regex);
    Scanner sc = new Scanner(System.in);

    while (!matches) {
      System.out.println("올바른 숫자를 입력 해 주세요 : ");

      input = sc.nextLine();
      matches = input.matches(regex);

    }
    return input;
  }

  public String getInput() {
    return input;
  }
}
