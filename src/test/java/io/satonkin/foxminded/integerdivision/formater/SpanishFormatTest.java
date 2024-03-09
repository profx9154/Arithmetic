package io.satonkin.foxminded.integerdivision.formater;

import io.satonkin.foxminded.integerdivision.calculator.Calculator;
import io.satonkin.foxminded.integerdivision.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SpanishFormatTest {

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
    int dividend = 78945;
    int divisor = 4;
    int reminder = 1;
    ArrayList<Integer> minuend = new ArrayList<>();
    minuend.add(7);
    minuend.add(38);
    minuend.add(29);
    minuend.add(14);
    minuend.add(25);
    ArrayList<Integer> subtrahend = new ArrayList<>();
    subtrahend.add(4);
    subtrahend.add(36);
    subtrahend.add(28);
    subtrahend.add(12);
    subtrahend.add(24);
    Result input = new Result(dividend, divisor, reminder, minuend, subtrahend);
    Formatter spanishFormatterExample1 = FormatterFactory.creatrFormatter("Spanish");
    String actual = spanishFormatterExample1.format(input);
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
    int dividend = 789;
    int divisor = 5;
    int reminder = 4;
    ArrayList<Integer> minuend = new ArrayList<>();
    minuend.add(7);
    minuend.add(28);
    minuend.add(39);
    ArrayList<Integer> subtrahend = new ArrayList<>();
    subtrahend.add(5);
    subtrahend.add(25);
    subtrahend.add(35);
    Result input = new Result(dividend, divisor, reminder, minuend, subtrahend);
    Formatter spanishFormatterExample2 = FormatterFactory.creatrFormatter("Spanish");
    String actual = spanishFormatterExample2.format(input);
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
    int dividend = 999;
    int divisor = 5;
    int reminder = 4;
    ArrayList<Integer> minuend = new ArrayList<>();
    minuend.add(9);
    minuend.add(49);
    minuend.add(49);
    ArrayList<Integer> subtrahend = new ArrayList<>();
    subtrahend.add(5);
    subtrahend.add(45);
    subtrahend.add(45);
    Result input = new Result(dividend, divisor, reminder, minuend, subtrahend);
    Formatter spanishFormatterExample3 = FormatterFactory.creatrFormatter("Spanish");
    String expected = spanishFormatterExample3.format(input);
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
    int dividend = 500;
    int divisor = 2;
    int reminder = 0;
    ArrayList<Integer> minuend = new ArrayList<>();
    minuend.add(5);
    minuend.add(10);
    ArrayList<Integer> subtrahend = new ArrayList<>();
    subtrahend.add(4);
    subtrahend.add(10);
    Result input = new Result(dividend, divisor, reminder, minuend, subtrahend);
    Formatter spanishFormatterExample4 = FormatterFactory.creatrFormatter("Spanish");
    String expected = spanishFormatterExample4.format(input);
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