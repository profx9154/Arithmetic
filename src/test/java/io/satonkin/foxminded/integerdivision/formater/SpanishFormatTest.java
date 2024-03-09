package io.satonkin.foxminded.integerdivision.formater;

import io.satonkin.foxminded.integerdivision.calculator.Calculator;
import io.satonkin.foxminded.integerdivision.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpanishFormatTest {

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
      "      1";
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945, 4);
    Formatter spanishFormatterExample1 = FormatterFactory.creatrFormatter("Spanish");
    String expectedSpanishFormatExample1 = spanishFormatterExample1.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample1, actualSpanishFormatExample1);


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
    Result result = calculator.divide(789, 5);
    Formatter spanishFormatterExample2 = FormatterFactory.creatrFormatter("Spanish");
    String expectedSpanishFormatExample2 = spanishFormatterExample2.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample2, actualSpanishFormatExample2);


  }

  @Test
  void testSpanishFormatExample3() {
    String actualSpanishFormatExample3 = "_999|5\n" +
      " 5  |___\n" +
      " _  |199\n" +
      "_49\n" +
      " 45\n" +
      " --\n" +
      " _49\n" +
      "  45\n" +
      "  --\n" +
      "    4";

    Calculator calculator = new Calculator();
    Result result = calculator.divide(999, 5);
    Formatter spanishFormatterExample3 = FormatterFactory.creatrFormatter("Spanish");
    String expectedSpanishFormatExample3 = spanishFormatterExample3.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample3, actualSpanishFormatExample3);


  }

  @Test
  void testSpanishFormatExample4() {
    String actualSpanishFormatExample4 = "_500|2\n" +
      " 4  |___\n" +
      " _  |250\n" +
      "_10\n" +
      " 10\n" +
      " --\n" +
      "    0";
    Calculator calculator = new Calculator();
    Result result = calculator.divide(500, 2);
    Formatter spanishFormatterExample4 = FormatterFactory.creatrFormatter("Spanish");
    String expectedSpanishFormatExample4 = spanishFormatterExample4.format(result);
    Assertions.assertEquals(expectedSpanishFormatExample4, actualSpanishFormatExample4);


  }

  @Test
  void testCheckByNullSpanishFormat() {
    Formatter germanFormatter = new GermanFormat();
    Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
      () -> {
        germanFormatter.format(null);
      });

    String expectedMessage = "You cannot pass null to this function";
    String actualMessage = exception.getMessage();
    Assertions.assertEquals(actualMessage, expectedMessage);
  }

}