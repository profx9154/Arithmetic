package io.satonkin.foxminded.integerdivision;

public class SpanishFormat implements Formatter {
  private static final String LINE_SEPARATOR = "\n";

  public SpanishFormat() {}

  @Override
  public String format(Result result) {
    checkByNull(result);
    StringBuilder output = new StringBuilder();
    output.append(createFirstСolumn(result));
    output.append(createSecondColumn(result));
    output.append(createThirdColumn(result));
    return output.toString();
  }

  public StringBuilder createFirstСolumn(Result result) {
    StringBuilder firstColumn = new StringBuilder();
    firstColumn.append(addDashToMinuend(result.getDividend()) + "|" + result.getDivisor() + LINE_SEPARATOR);
    firstColumn.append(" " + result.getSubtrahend().get(0) + addCharInString(calculateLengthDigit(result.getDividend()) - 1, ' ') +
      "|" + addCharInString(calculateLengthDigit(result.getQuotient()), '_') + LINE_SEPARATOR);
    firstColumn.append(" " + addCharInString(1, '_') +
      addCharInString(calculateLengthDigit(result.getDividend()) - 1, ' ') + "|" + result.getQuotient() + LINE_SEPARATOR);
    return firstColumn;
  }

  public StringBuilder createSecondColumn(Result result) {
    StringBuilder secondLine = new StringBuilder();
    for (int i = 1, j = 1; i < result.getMinuend().size(); i++, j++) {
      int reminderMinuend = result.getMinuend().get(i);
      int reminderSubtrahend = result.getSubtrahend().get(j);
      secondLine.append(addCharInString(i - 1, ' ') + addDashToMinuend(reminderMinuend) + LINE_SEPARATOR);
      secondLine.append(addCharInString(i, ' ') + reminderSubtrahend + LINE_SEPARATOR);
      secondLine.append(addCharInString(i, ' ') + addCharInString(calculateLengthDigit(reminderSubtrahend), '-') + LINE_SEPARATOR);
      if (i >= reminderMinuend) {
        createThirdColumn(result);
      }
    }
    return secondLine;
  }

  public StringBuilder createThirdColumn(Result result) {
    StringBuilder thirdLine = new StringBuilder();
    thirdLine.append(addCharInString(calculateLengthDigit(result.getDividend()) + 1, ' '));
    thirdLine.append(result.getReminder());
    return thirdLine;
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

  private int calculateLengthDigit(int i) {
    return (int) Math.log10(i) + 1;
  }

  private void checkByNull(Result result) {
    if (result == null) {
      throw new IllegalArgumentException("You cannot pass null to this function");
    }
  }


}
