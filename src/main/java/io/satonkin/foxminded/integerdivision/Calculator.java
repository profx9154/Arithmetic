package io.satonkin.foxminded.integerdivision;

import java.util.ArrayList;

public class Calculator {
  public Result divide(int dividend, int divisor) throws Exception {
    checkByException(dividend, divisor);
    ArrayList<Integer> listMinuend = new ArrayList<Integer>();
    ArrayList<Integer> listSubtrahend = new ArrayList<Integer>();
    ArrayList<Integer> listReminder = new ArrayList<Integer>();
    int subtrahend;
    int minuend;
    int difference = 0;
    Integer intReminder;
    String stringReminder = "";
    ArrayList<Integer> listDividend = convertingCumberToArray(dividend);
    for (int i = 0; i < listDividend.size(); i++) {
      stringReminder = stringReminder + listDividend.get(i).toString();
      intReminder = Integer.parseInt(stringReminder);
      listReminder.add(intReminder);
      if (intReminder > divisor) {
        minuend = intReminder;
        listMinuend.add(minuend);
        subtrahend = intReminder / divisor * divisor;
        listSubtrahend.add(subtrahend);
        intReminder = minuend - subtrahend;
        difference = minuend - subtrahend;
        stringReminder = intReminder.toString();
      }
    }
    Result result = new Result(dividend, divisor, difference, listMinuend, listSubtrahend);
    return result;
  }

  public ArrayList convertingCumberToArray(int dividend) {
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
      throw new IllegalArgumentException("Dividend and divisor must be positive");
    } if (divisor > dividend) {
      float quotient = 0;
      quotient = (float) dividend / divisor;
      System.out.println("Divisor more dividend quotient will be  " + quotient);
    }

  }


}



























