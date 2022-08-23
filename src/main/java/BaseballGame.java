import java.util.Scanner;

public class BaseballGame {

  public static void main(String[] args) {

    System.out.print("숫자를 입력 해 주세요 : ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    InputNumber validation = new InputNumber(input);

    input = validation.getInput();
  }
}
