import java.util.List;
import java.util.Scanner;

public class BaseballGame {

  public static void main(String[] args) {

    int restartCheck = 1;
    List<Integer> randomNumber = RandomNumber.randomList();

    while(isContinue(restartCheck)){

      System.out.print("숫자를 입력 해 주세요 : ");
      Scanner sc = new Scanner(System.in);

      String input = sc.nextLine();

      if(!InputNumber.isValidInput(input)){
        System.out.println("잘못 된 입력입니다.");
        continue;
      }

      ResultView.ball(CompareNumber.countBall(randomNumber, input));

      ResultView.strike(CompareNumber.countStrike(randomNumber, input));

      ResultView.out(CompareNumber.countBall(randomNumber, input), CompareNumber.countStrike(randomNumber, input));

      System.out.println();

      if(CompareNumber.countStrike(randomNumber, input) == 3){
        System.out.println("게임을 새로 시작하시려면 1, 종료하려면 2를 입력하세요.");
        restartCheck = sc.nextInt();
        randomNumber = RandomNumber.randomList();
      }

    }
  }

  private static boolean isContinue(Integer input){
    return input == 1;
  }
}
