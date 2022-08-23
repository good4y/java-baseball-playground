package study.practice;

import java.util.function.BiFunction;

public enum Operator {
  PLUS("+", (num1, num2) -> num1 + num2),
  MINUS("-", (num1, num2) -> num1 - num2),
  MULTIPLY("*", (num1, num2) -> num1 * num2),
  DIVIDE("/", (num1, num2) -> {
    if(Float.isInfinite(num1/num2)){
      throw new ArithmeticException();
    }
    return num1 / num2;
  });

  private final String symbol;
  private final BiFunction<Float, Float, Float> expression;

  Operator(String symbol, BiFunction<Float, Float, Float> expression) {
    this.symbol = symbol;
    this.expression = expression;
  }

  public static float calculate(float num1, float num2, String inputSymbol) {
    for (Operator operator : Operator.values()) {
      if (operator.match(inputSymbol)) {
        return operator.expression.apply(num1, num2);
      }
    }
    throw new IllegalArgumentException();
  }

  private boolean match(String inputSymbol) {
    return this.symbol.equals(inputSymbol);
  }
}
