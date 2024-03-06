package io.satonkin.foxminded.integerdivision;

public class Main {
  public static void main(String[] args) throws Exception {
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945,4);
    Formatter formatter =new  SpanishFormat() ;
    String ouput=formatter.format(result);
    System.out.println(ouput);
  }
}
