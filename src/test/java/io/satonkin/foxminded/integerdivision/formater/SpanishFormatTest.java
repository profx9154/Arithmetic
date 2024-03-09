package io.satonkin.foxminded.integerdivision.formater;

import io.satonkin.foxminded.integerdivision.calculator.Calculator;
import io.satonkin.foxminded.integerdivision.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpanishFormatTest {
  Formatter formatter = new SpanishFormat();
  @Test
  void testSpanishFormatExample1() {
    String expected = "_78945|4\n" +
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
    Result input = new Result(78945, 4, 1, List.of(7,38,29,14,25),List.of(4,36,28,12,24));
    String actual = formatter.format(input);
    Assertions.assertEquals(expected, actual);


  }

  @Test
  void testSpanishFormatExample2() {
    String expected = "_789|5\n" +
      " 5  |___\n" +
      " _  |157\n" +
      "_28\n" +
      " 25\n" +
      " --\n" +
      " _39\n" +
      "  35\n" +
      "  --\n" +
      "    4";
    Result input = new Result(789, 5, 4,  List.of(7,28,39), List.of(5,25,35));
    String actual = formatter.format(input);
    Assertions.assertEquals(expected, actual);


  }

  @Test
  void testSpanishFormatExample3() {
    String actual = "_999|5\n" +
      " 5  |___\n" +
      " _  |199\n" +
      "_49\n" +
      " 45\n" +
      " --\n" +
      " _49\n" +
      "  45\n" +
      "  --\n" +
      "    4";
    Result input = new Result(999, 5, 4,  List.of(9,49,49), List.of(5,45,45));
    String expected = formatter.format(input);
    Assertions.assertEquals(expected, actual);


  }

  @Test
  void testSpanishFormatExample4() {
    String actual = "_500|2\n" +
      " 4  |___\n" +
      " _  |250\n" +
      "_10\n" +
      " 10\n" +
      " --\n" +
      "    0";
    Result input = new Result(500, 2, 0, List.of(5,10), List.of(4,10));
    String expected = formatter.format(input);
    Assertions.assertEquals(expected, actual);


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