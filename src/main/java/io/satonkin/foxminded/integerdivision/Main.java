package io.satonkin.foxminded.integerdivision;

public class Main {
  public static void main(String[] args) {
    Division division = new Division();
    DivisionPrinter divisionPrinter = new DivisionPrinter();
    divisionPrinter.printCalculations(division.startDivision(999, 52));


  }
}
