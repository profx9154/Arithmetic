package io.satonkin.foxminded.integerdivision;

import java.util.ArrayList;
public class Result {
  private final int dividend;
  private final int divisor;
  private final int quotient;
  private final int reminder;
  private final ArrayList<Integer> minuend;
  private final ArrayList<Integer> subtrahend;
  public Result(int dividend, int divisor,  int reminder, ArrayList<Integer> minuend, ArrayList<Integer> subtrahend) {
    this.dividend = dividend;
    this.divisor = divisor;
    this.quotient =dividend / divisor;
    this.reminder = reminder;
    this.minuend = minuend;
    this.subtrahend = subtrahend;
  }

  public int getDividend() {
    return dividend;
  }

  public int getDivisor() {
    return divisor;
  }

  public int getQuotient() {
    return quotient;
  }

  public int getReminder() {
    return reminder;
  }

  public ArrayList<Integer> getMinuend() {
    return minuend;
  }

  public ArrayList<Integer> getSubtrahend() {
    return subtrahend;
  }
}
