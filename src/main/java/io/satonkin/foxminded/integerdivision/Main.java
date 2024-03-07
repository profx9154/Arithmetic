package io.satonkin.foxminded.integerdivision;

public class Main {
  public static void main(String[] args) throws Exception {
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945,4);
    Formatter spanishFormatter =new  SpanishFormat() ;
    Formatter germanFormatter=new GermanFormat();
    String ouputSpanishFormat=spanishFormatter.format(result);
    String ouputGermanFormat=germanFormatter.format(result);
    System.out.println(ouputSpanishFormat);
    System.out.println(" ");
    System.out.println(ouputGermanFormat);
  }
}
