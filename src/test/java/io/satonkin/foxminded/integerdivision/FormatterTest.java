package io.satonkin.foxminded.integerdivision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatterTest {
  @Test
  void testSpanishFormat() {
    String actualSpanishFormat = "_78945|4\n" +
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
    Formatter spanishFormatter=FormatterFactory.creatrFormatter("Spanish");
    String expectedSpanishFormat=spanishFormatter.format(result);
    Assertions.assertEquals(expectedSpanishFormat, actualSpanishFormat);



  }

  @Test
  void testGermanFormat() {
    String actualGermanFormat="78945 ÷4 => 19736\n" +
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
    Formatter spanishFormatter=FormatterFactory.creatrFormatter("German");
    String expectedSpanishFormat=spanishFormatter.format(result);
    Assertions.assertEquals(expectedSpanishFormat, actualGermanFormat);
  }
}