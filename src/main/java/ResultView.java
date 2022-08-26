public class ResultView {

  public static void ball(int ball) {
    if(ball > 0){
      System.out.print(ball + "볼 ");
    }
  }

  public static void strike(int strike) {
    if(strike > 0) {
      System.out.print(strike + "스트라이크");
    }
  }

  public static void out(int ball, int strike) {
    if(ball == 0 && strike == 0){
      System.out.print("아웃");
    }
  }
}
