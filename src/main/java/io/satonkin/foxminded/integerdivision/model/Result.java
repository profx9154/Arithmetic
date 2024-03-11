package io.satonkin.foxminded.integerdivision.model;

import java.util.ArrayList;
import java.util.List;

public class Result {
  private final int dividend;
  private final int divisor;
  private final int quotient;
  private final int reminder;
  private final List<Integer> minuend;
  private final List<Integer> subtrahend;

  public Result(int dividend, int divisor, int reminder, List<Integer> minuend, List<Integer> subtrahend) {
    this.dividend = dividend;
    this.divisor = divisor;
    this.quotient = dividend / divisor;
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

  public List<Integer> getMinuend() {
    return minuend;
  }

  public List<Integer> getSubtrahend() {
    return subtrahend;
  }
}
