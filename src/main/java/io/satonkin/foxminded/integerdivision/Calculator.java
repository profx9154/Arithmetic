package io.satonkin.foxminded.integerdivision;

import java.util.ArrayList;

public class Calculator {
  public Result divide(int dividend, int divisor) {
    checkByException(dividend, divisor);
    ArrayList<Integer> listMinuend = new ArrayList<Integer>();
    ArrayList<Integer> listSubtrahend = new ArrayList<Integer>();
    int subtrahend;
    int minuend;
    int reminder = 0;
    Integer intReminder;
    String stringReminder = "";
    ArrayList<Integer> listDividend = breakDownIntoIndividualNumbers(dividend);
    for (int i = 0; i < listDividend.size(); i++) {
      stringReminder = stringReminder + listDividend.get(i).toString();
      intReminder = Integer.parseInt(stringReminder);
      if (intReminder > divisor) {
        minuend = intReminder;
        listMinuend.add(minuend);
        subtrahend = intReminder / divisor * divisor;
        listSubtrahend.add(subtrahend);
        intReminder = minuend - subtrahend;
        reminder = minuend - subtrahend;
        stringReminder = intReminder.toString();
      }
    }
    Result result = new Result(dividend, divisor, reminder, listMinuend, listSubtrahend);
    return result;
  }

  public ArrayList breakDownIntoIndividualNumbers(int dividend) {
    ArrayList<Integer> listDividend = new ArrayList();
    String[] stringDivident = String.valueOf(dividend).split("");
    for (int i = 0; i < stringDivident.length; i++) {
      listDividend.add(Integer.parseInt(stringDivident[i].toString()));
    }
    return listDividend;

  }

  public void checkByException(int dividend, int divisor) {
    if (divisor == 0) {
      throw new IllegalArgumentException("Divisor can't be zero");
    } if (dividend < 0 || divisor < 0) {
      throw new ArithmeticException("Dividend and divisor must be positive");
    } if (divisor > dividend) {
      float quotient = 0;
      quotient = (float) dividend / divisor;
      throw new ArithmeticException("Divisor more Dividend answer " + quotient);
    }

  }

}



























