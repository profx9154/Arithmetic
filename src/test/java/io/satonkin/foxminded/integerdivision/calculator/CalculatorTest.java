package io.satonkin.foxminded.integerdivision.calculator;

import io.satonkin.foxminded.integerdivision.calculator.Calculator;
import io.satonkin.foxminded.integerdivision.model.Result;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CalculatorTest {
  Calculator calculator = new Calculator();

  @Test
  void testDivideExpectationQuotient() {
    Result expected = new Result(78945, 4, 1, List.of(7,38,29,14,25),List.of(4,36,28,12,24));
    Result actual = calculator.divide(78945, 4);
    int actualQuotient = actual.getQuotient();
    Assertions.assertEquals(expected.getQuotient(), actualQuotient);

  }


  @Test
  void testDivideExpectationReminder() {
    Result expected = new Result(78945, 4, 1, List.of(7,38,29,14,25),List.of(4,36,28,12,24));
    Result actual = calculator.divide(78945, 4);
    Assertions.assertEquals(expected.getReminder(), actual.getReminder());

  }


  @Test
  void testDivideExpectationListSubtrahend() {
    Result expected = new Result(78945, 4, 1, List.of(7,38,29,14,25),List.of(4,36,28,12,24));
    Result actual = calculator.divide(78945, 4);
    Assertions.assertEquals(expected.getSubtrahend(), actual.getSubtrahend());
  }


  @Test
  void testDivideExpectationListMinuend() {
    Result expected = new Result(78945, 4, 1, List.of(7,38,29,14,25),List.of(4,36,28,12,24));
    Result actual = calculator.divide(78945, 4); ;
    Assertions.assertEquals(expected.getMinuend(), actual.getMinuend());
  }

  @Test
  void testBreakDownIntoIndividualNumbers() {
    ArrayList<Integer> testRealStringDividend = new ArrayList<>();
    testRealStringDividend.add(7);
    testRealStringDividend.add(8);
    testRealStringDividend.add(9);
    testRealStringDividend.add(4);
    testRealStringDividend.add(5);
    int testDividend = 78945;
    String[] testStringDividend = String.valueOf(testDividend).split("");
    ArrayList<Integer> testExpectationDividend = new ArrayList<>();
    for (int i = 0; i < testStringDividend.length; i++) {
      testExpectationDividend.add(Integer.parseInt(testStringDividend[i].toString()));
    }
    Assertions.assertEquals(testRealStringDividend, testExpectationDividend);

  }

  @Test
  void testCheckByExceptionByZero() {
    Exception exception = Assertions.assertThrows(IllegalArgumentException.class,
      () -> {
        calculator.divide(78945, 0);
      });

    String expectedMessage = "Divisor can't be zero";
    String actualMessage = exception.getMessage();

    Assertions.assertEquals(actualMessage, expectedMessage);
  }

  @Test
  void testCheckByExceptionNumberShouldBePositive() {
    Exception exception = Assertions.assertThrows(ArithmeticException.class,
      () -> {
        calculator.divide(-78945, 5);
      });

    String expectedMessage = "Dividend and divisor must be positive";
    String actualMessage = exception.getMessage();

    Assertions.assertEquals(actualMessage, expectedMessage);
  }

  @Test
  void testCheckByExceptionDivisorMoreDividend() {
    Exception exception = Assertions.assertThrows(ArithmeticException.class,
      () -> {
        calculator.divide(1, 100);
      });
    String expectedMessage = "Divisor more Dividend answer 0.01";
    String actualMessage = exception.getMessage();

    Assertions.assertEquals(actualMessage, expectedMessage);
  }


  @Test
  void testCheckByExceptionDivisorSameDividend() {
    Exception exception = Assertions.assertThrows(ArithmeticException.class,
      () -> {
        calculator.divide(100, 100);
      });
    String actual = "Divisor same Dividend answer " + 1;
    String expected  = exception.getMessage();

    Assertions.assertEquals(expected , actual);
  }
}