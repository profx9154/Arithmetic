package io.satonkin.foxminded.integerdivision;

public class Main {
  public static void main(String[] args) throws Exception {
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945,4);
    Formatter spanishFormatter =new  SpanishFormat() ;
    Formatter germanFormatter=new GermanFormat();
    String ouput=spanishFormatter.format(result);
    String ouput2=germanFormatter.format(result);
    // System.out.println(ouput);
    System.out.println(ouput2);
  }
}
