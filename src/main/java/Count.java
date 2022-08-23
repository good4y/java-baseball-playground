import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Count {

  public static int ball(String input, String answer){
    int ballCount = 0;
    // When
    List<String> inputNumber = Arrays.asList(input.split(""));

    for(int i = 0; i < 3; i++){
      if(answer.contains(inputNumber.get(i))){
        ballCount++;
      }
    }
    return ballCount;
  }

  public static int strike(String input, String answer){
    int strikeCount = 0;
    // When
    List<String> inputNumber = Arrays.asList(input.split(""));

    for(int i = 0; i < 3; i++){
      if(input.charAt(i) == answer.charAt(i)) {
        strikeCount++;
      }
    }
    return strikeCount;
  }

  public static int print(int ball, int strike){
    int start = 1;

    if (ball != 0) {
      System.out.print(ball + "볼 ");
    }

    if (strike != 0) {
      System.out.print(strike + "스트라이크");
    }
    System.out.println();

    if (strike == 3) {
      System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
      System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
      Scanner sc1 = new Scanner(System.in);
      start = sc1.nextInt();
    }

    return start;
  }
}
