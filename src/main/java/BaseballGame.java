import java.util.Scanner;

public class BaseballGame {

  public static void main(String[] args) {
    int start = 1;
    while (start == 1) {
      System.out.print("숫자를 입력 해 주세요 : ");
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();
      InputNumber validation = new InputNumber(input);

      input = validation.getInput();
      int ball = Count.ball(input, "123");
      int strike = Count.strike(input, "123");
      ball -= strike;

      start = Count.print(ball, strike);
    }
  }
}
