package io.satonkin.foxminded.integerdivision.formater;

import io.satonkin.foxminded.integerdivision.calculator.Calculator;
import io.satonkin.foxminded.integerdivision.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GermanFormatTest {
  Formatter formatter = new GermanFormat();

  @Test
  void testGermanFormatExample1() {
    String actual = "78945 ÷4 => 19736\n" +
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
    String expected = formatter.format(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testGermanFormatExample2() {
    String actual = "789 ÷5 => 157\n" +
      "5\n" +
      "_\n" +
      "28\n" +
      "25\n" +
      "__\n" +
      " 39\n" +
      " 35\n" +
      " __\n" +
      "  4";
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
    String expected = formatter.format(input);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void testGermanFormatExample3() {
    String actual = "999 ÷5 => 199\n" +
      "5\n" +
      "_\n" +
      "49\n" +
      "45\n" +
      "__\n" +
      " 49\n" +
      " 45\n" +
      " __\n" +
      "  4";
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
    String expected = formatter.format(input);
    Assertions.assertEquals(expected, actual);
  }


  @Test
  void testGermanFormatExample4() {
    String actual = "500 ÷2 => 250\n" +
      "4\n" +
      "_\n" +
      "10\n" +
      "10\n" +
      "__\n" +
      "  0";
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
    String expected = formatter.format(input);
    Assertions.assertEquals(expected, actual);
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