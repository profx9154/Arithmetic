package io.satonkin.foxminded.integerdivision.formater;

import io.satonkin.foxminded.integerdivision.calculator.Calculator;
import io.satonkin.foxminded.integerdivision.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanFormatTest {

  @Test
  void testGermanFormatExample1() {
    String actualGermanFormatExample1 = "78945 ÷4 => 19736\n" +
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
    Result result = calculator.divide(78945, 4);
    Formatter spanishFormatterExample1 = FormatterFactory.creatrFormatter("German");
    String expectedSpanishFormatExample1 = spanishFormatterExample1.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample1, actualGermanFormatExample1);
  }

  @Test
  void testGermanFormatExample2() {
    String actualGermanFormatExample2 = "789 ÷5 => 157\n" +
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
    Result result = calculator.divide(789, 5);
    Formatter spanishFormatterExample2 = FormatterFactory.creatrFormatter("German");
    String expectedSpanishFormatExample2 = spanishFormatterExample2.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample2, actualGermanFormatExample2);
  }

  @Test
  void testGermanFormatExample3() {
    String actualGermanFormatExample3 = "999 ÷5 => 199\n" +
      "5\n" +
      "_\n" +
      "49\n" +
      "45\n" +
      "__\n" +
      " 49\n" +
      " 45\n" +
      " __\n" +
      "  4";
    Calculator calculator = new Calculator();
    Result result = calculator.divide(999, 5);
    Formatter spanishFormatterExample3 = FormatterFactory.creatrFormatter("German");
    String expectedSpanishFormatExample3 = spanishFormatterExample3.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample3, actualGermanFormatExample3);
  }


  @Test
  void testGermanFormatExample4() {
    String actualGermanFormatExample4 = "500 ÷2 => 250\n" +
      "4\n" +
      "_\n" +
      "10\n" +
      "10\n" +
      "__\n" +
      "  0";
    Calculator calculator = new Calculator();
    Result result = calculator.divide(500, 2);
    Formatter spanishFormatterExample4 = FormatterFactory.creatrFormatter("German");
    String expectedSpanishFormatExample4 = spanishFormatterExample4.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample4, actualGermanFormatExample4);
  }

  @Test
  void testCheckByNullGermanFormat() {
    Formatter spanishFormatter = new SpanishFormat();
    Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
      () -> {
        spanishFormatter.format(null);
      });

    String expectedMessage = "You cannot pass null to this function";
    String actualMessage = exception.getMessage();
    Assertions.assertEquals(actualMessage, expectedMessage);
  }
}