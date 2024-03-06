package io.satonkin.foxminded.integerdivision;

public class SpanishFormat implements Formatter {
  private static final String LINE_SEPARATOR = "\n";

  @Override
  public String format(Result result) {
    StringBuilder output = new StringBuilder();
    output.append(createFirstСolumn(result));
    output.append(createSecondLine(result));
    System.out.println(output);
    return "";
  }

  public StringBuilder createFirstСolumn(Result result) {
    StringBuilder firstColumn = new StringBuilder();
    String firstLine = addDashToMinuend(result.getDividend()) + "|" + result.getDivisor() + LINE_SEPARATOR;
    String secondLine = " " + result.getSubtrahend().get(0) + addCharInString(calculateLenghtDigit(result.getDividend()) - 1, ' ') +
      "|" + addCharInString(calculateLenghtDigit(result.getQuotient()), '_') + LINE_SEPARATOR;
    String thirdLine = " " + addCharInString(1, '_') +
      addCharInString(calculateLenghtDigit(result.getDividend()) - 1, ' ') + "|" + result.getQuotient() + LINE_SEPARATOR;
    firstColumn.append(firstLine + secondLine + thirdLine);
    return firstColumn;
  }

  public StringBuilder createSecondLine(Result result) {
    StringBuilder secondLine = new StringBuilder();


    return secondLine;
  }

  public StringBuilder createThirdLine(Result result) {
    StringBuilder secondLine = new StringBuilder();
    secondLine.append(addDashToMinuend(result.getMinuend().get(1)));

    return secondLine;
  }

  public String addDashToMinuend(int number) {
    String ouputString = "_" + number;
    return ouputString;
  }


  public String addCharInString(int numberOfSymbols, char symbol) {
    StringBuilder string = new StringBuilder();
    for (int i = 0; i < numberOfSymbols; i++) {
      string.append(symbol);
    }
    return string.toString();
  }

  private int calculateLenghtDigit(int i) {
    return (int) Math.log10(i) + 1;
  }


}
