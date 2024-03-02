package io.satonkin.foxminded.integerdivision;

import java.util.ArrayList;

public class Calculator {
  public Result divide(int dividend, int divisor) throws Exception {
    checkDivideByZero(dividend,divisor);
    checkNegativeNumber(dividend,divisor);
    if (divisor>dividend){
      checkDivisorMoreDividend(dividend,divisor);
    }

    ArrayList<Integer> listMinuend = new ArrayList<Integer>();
    ArrayList<Integer> listSubtrahend = new ArrayList<Integer>();
    ArrayList<Integer> listReminder = new ArrayList<Integer>();
    int subtrahend;
    int minuend;
    int difference = 0;
    int quotient=dividend/divisor;
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
    Result result=new Result(dividend,divisor,quotient,difference,listMinuend,listSubtrahend);
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

  public void checkDivideByZero(int dividend, int divisor){
    int quotient=0;
    try {
      quotient = dividend / divisor;
    } catch (ArithmeticException DivideByZero) {
      System.out.println("YOU CAN'T DIVIDE BY ZERO.");
    }
  }
  public  void checkDivisorMoreDividend(int dividend, int divisor){
    float quotient=0;
    if (divisor>dividend){
       quotient = (float) dividend / divisor;
      System.out.println(""+quotient);
    }
  }


  public void checkNegativeNumber(int dividend, int divisor) throws Exception {
    if (dividend<0||divisor<0){
      System.out.println("NEGATIVE NUMBER PLEASE TRY AGAIN");
      throw new Exception();
    }
  }
  }



























