package io.satonkin.foxminded.integerdivision;

public class SpanishFormat implements Formatter {
  private static final String LINE_SEPARATOR = "\n";

  @Override
  public String format(Result result) {
    StringBuilder output = new StringBuilder();
    output.append(createFirstСolumn(result));
    output.append(createSecondColumn(result));
    output.append(createThirdColumn(result));
    return output.toString();
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

  public StringBuilder createSecondColumn(Result result) {
    StringBuilder secondLine = new StringBuilder();
    for (int i=1,j=1;i<result.getMinuend().size();i++,j++){
      int reminderMinuend=result.getMinuend().get(i);
      int reminderSubtrahend=result.getSubtrahend().get(j);
      secondLine.append(addCharInString(i-1,' '));
      secondLine.append(addDashToMinuend(reminderMinuend));
      secondLine.append(LINE_SEPARATOR);
      secondLine.append(addCharInString(i,' '));
      secondLine.append(reminderSubtrahend);
      secondLine.append(LINE_SEPARATOR);
      secondLine.append(addCharInString(i,' '));
      secondLine.append(addCharInString(calculateLenghtDigit(reminderSubtrahend),'-'));
      secondLine.append(LINE_SEPARATOR);
      if (i>=reminderMinuend){
        createThirdColumn(result);
      }
    }
    return secondLine;
  }

  public StringBuilder createThirdColumn(Result result) {
    StringBuilder thirdLine = new StringBuilder();
    thirdLine.append(addCharInString(calculateLenghtDigit(result.getDividend())+1,' '));
    thirdLine.append(result.getDifference());
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

  private int calculateLenghtDigit(int i) {
    return (int) Math.log10(i) + 1;
  }


}
