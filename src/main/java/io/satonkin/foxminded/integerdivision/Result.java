package io.satonkin.foxminded.integerdivision;

import java.util.ArrayList;
public class Result {
  private final int dividend;
  private final int divisor;
  private final int quotient;

  private final int difference;
  private final ArrayList<Integer> minuend;
  private final ArrayList<Integer> subtrahend;
  public Result(int dividend, int divisor, int quotient, int difference, ArrayList<Integer> minuend, ArrayList<Integer> subtrahend) {
    this.dividend = dividend;
    this.divisor = divisor;
    this.quotient = quotient;
    this.difference = difference;
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

  public int getDifference() {
    return difference;
  }

  public ArrayList<Integer> getMinuend() {
    return minuend;
  }

  public ArrayList<Integer> getSubtrahend() {
    return subtrahend;
  }
}
