package io.satonkin.foxminded.integerdivision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {
  @Test
  void testSpanishFormatExample1() {
    String actualSpanishFormatExample1 = "_78945|4\n" +
      " 4    |_____\n" +
      " _    |19736\n" +
      "_38\n" +
      " 36\n" +
      " --\n" +
      " _29\n" +
      "  28\n" +
      "  --\n" +
      "  _14\n" +
      "   12\n" +
      "   --\n" +
      "   _25\n" +
      "    24\n" +
      "    --\n" +
      "      1" ;
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945,4);
    Formatter spanishFormatterExample1=FormatterFactory.creatrFormatter("Spanish");
    String expectedSpanishFormatExample1=spanishFormatterExample1.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample1, actualSpanishFormatExample1);



  }

  @Test
  void testGermanFormatExample1() {
    String actualGermanFormatExample1="78945 ÷4 => 19736\n" +
      "4\n" +
      "_\n" +
      "38\n" +
      "36\n" +
      "__\n" +
      " 29\n" +
      " 28\n" +
      " __\n" +
      "  14\n" +
      "  12\n" +
      "  __\n" +
      "   25\n" +
      "   24\n" +
      "   __\n" +
      "    1";
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945,4);
    Formatter spanishFormatterExample1=FormatterFactory.creatrFormatter("German");
    String expectedSpanishFormatExample1=spanishFormatterExample1.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample1, actualGermanFormatExample1);
  }

  @Test
  void testSpanishFormatExample2() {
    String actualSpanishFormatExample2 = "_789|5\n" +
      " 5  |___\n" +
      " _  |157\n" +
      "_28\n" +
      " 25\n" +
      " --\n" +
      " _39\n" +
      "  35\n" +
      "  --\n" +
      "    4";
    Calculator calculator = new Calculator();
    Result result = calculator.divide(789,5);
    Formatter spanishFormatterExample2=FormatterFactory.creatrFormatter("Spanish");
    String expectedSpanishFormatExample2=spanishFormatterExample2.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample2, actualSpanishFormatExample2);



  }

  @Test
  void testGermanFormatExample2() {
    String actualGermanFormatExample2="789 ÷5 => 157\n" +
      "5\n" +
      "_\n" +
      "28\n" +
      "25\n" +
      "__\n" +
      " 39\n" +
      " 35\n" +
      " __\n" +
      "  4";
    Calculator calculator = new Calculator();
    Result result = calculator.divide(789,5);
    Formatter spanishFormatterExample2=FormatterFactory.creatrFormatter("German");
    String expectedSpanishFormatExample2=spanishFormatterExample2.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample2, actualGermanFormatExample2);
  }
}