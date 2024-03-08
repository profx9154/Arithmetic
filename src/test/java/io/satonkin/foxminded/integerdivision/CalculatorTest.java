package io.satonkin.foxminded.integerdivision;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class CalculatorTest {

  @Test
  void testDivideExpectationQuotient() {
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945,4);
    int expectationQuotient= result.getQuotient();
    Assertions.assertEquals(19736, expectationQuotient);

  }


  @Test
  void testDivideExpectationReminder() {
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945,4);
    int expectationReminder= result.getReminder();
    Assertions.assertEquals(1, expectationReminder);

  }


  @Test
  void testDivideExpectationListSubtrahend() {
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945,4);
    ArrayList<Integer> expectationListSubtrahend=result.getSubtrahend();
    ArrayList<Integer>realListSubtrahend=new ArrayList<Integer>();
    realListSubtrahend.add(4);
    realListSubtrahend.add(36);
    realListSubtrahend.add(28);
    realListSubtrahend.add(12);
    realListSubtrahend.add(24);
    Assertions.assertEquals(expectationListSubtrahend, realListSubtrahend);
  }


  @Test
  void testDivideExpectationListMinuend() {
    Calculator calculator = new Calculator();
    Result result = calculator.divide(78945,4);
    ArrayList<Integer> expectationListMinuend=result.getMinuend();
    ArrayList<Integer>realListMinuend=new ArrayList<Integer>();
    realListMinuend.add(7);
    realListMinuend.add(38);
    realListMinuend.add(29);
    realListMinuend.add(14);
    realListMinuend.add(25);
    Assertions.assertEquals(expectationListMinuend, realListMinuend);
  }
  @Test
  void testBreakDownIntoIndividualNumbers() {
    ArrayList<Integer>testRealStringDividend=new ArrayList<>();
    testRealStringDividend.add(7);
    testRealStringDividend.add(8);
    testRealStringDividend.add(9);
    testRealStringDividend.add(4);
    testRealStringDividend.add(5);
    int testDividend=78945;
    String[] testStringDividend = String.valueOf(testDividend).split("");
    ArrayList<Integer> testExpectationDividend = new ArrayList<>();
    for (int i = 0; i < testStringDividend.length; i++) {
      testExpectationDividend.add(Integer.parseInt(testStringDividend[i].toString()));
    }
    Assertions.assertEquals(testRealStringDividend,testExpectationDividend);

  }

  @Test
  void checkByExceptionByZero() {
  }
}