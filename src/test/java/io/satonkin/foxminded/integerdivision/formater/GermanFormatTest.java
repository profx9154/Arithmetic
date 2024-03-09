package io.satonkin.foxminded.integerdivision.formater;

import io.satonkin.foxminded.integerdivision.calculator.Calculator;
import io.satonkin.foxminded.integerdivision.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GermanFormatTest {
  Formatter formatter = new GermanFormat();

  @Test
  void testGermanFormatExample1() {
    String actual = "78945 ÷4 => 19736\n" + "4\n" + "_\n" + "38\n" + "36\n" + "__\n" + " 29\n" + " 28\n" + " __\n" + "  14\n" + "  12\n" + "  __\n" + "   25\n" + "   24\n" + "   __\n" + "    1";
    Result input = new Result(78945, 4, 1, List.of(7, 38, 29, 14, 25), List.of(4, 36, 28, 12, 24));
    String expected = formatter.format(input); Assertions.assertEquals(expected, actual);
  }

  @Test
  void testGermanFormatExample2() {
    String actual = "789 ÷5 => 157\n" + "5\n" + "_\n" + "28\n" + "25\n" + "__\n" + " 39\n" + " 35\n" + " __\n" + "  4";
    Result input = new Result(789, 5, 4, List.of(7, 28, 39), List.of(5, 25, 35));
    String expected = formatter.format(input); Assertions.assertEquals(expected, actual);
  }

  @Test
  void testGermanFormatExample3() {
    String actual = "999 ÷5 => 199\n" + "5\n" + "_\n" + "49\n" + "45\n" + "__\n" + " 49\n" + " 45\n" + " __\n" + "  4";
    int dividend = 999; int divisor = 5; int reminder = 4;
    Result input = new Result(999, 5, 4, List.of(9, 49, 49), List.of(5, 45, 45));
    String expected = formatter.format(input); Assertions.assertEquals(expected, actual);
  }


  @Test
  void testGermanFormatExample4() {
    String actual = "500 ÷2 => 250\n" + "4\n" + "_\n" + "10\n" + "10\n" + "__\n" + "  0";
    Result input = new Result(500, 2, 0, List.of(5, 10), List.of(4, 10)); String expected = formatter.format(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testCheckByNullGermanFormat() {
    Formatter spanishFormatter = new SpanishFormat();
    Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
      spanishFormatter.format(null);
    });

    String expectedMessage = "You cannot pass null to this function"; String actualMessage = exception.getMessage();
    Assertions.assertEquals(actualMessage, expectedMessage);
  }
}