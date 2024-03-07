package io.satonkin.foxminded.integerdivision;

public class GermanFormat implements Formatter{
  private static final String LINE_SEPARATOR = "\n";

  public GermanFormat() {}

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
    firstColumn.append(result.getDividend()+" "+"÷"+result.getDivisor()+" "+"=>"+" "+ result.getQuotient()+LINE_SEPARATOR);
    firstColumn.append(result.getSubtrahend().get(0)+LINE_SEPARATOR+"_"+LINE_SEPARATOR);
    return firstColumn;
  }
  public StringBuilder createSecondColumn(Result result) {
    StringBuilder secondColumn = new StringBuilder();
    for (int i=1,j=1;i<result.getMinuend().size();i++,j++){
      int reminderMinuend=result.getMinuend().get(i);
      int reminderSubtrahend=result.getSubtrahend().get(j);
      secondColumn.append(addCharInString(i-1,' ')+reminderMinuend+LINE_SEPARATOR+addCharInString(i-1,' '));
      secondColumn.append(reminderSubtrahend+LINE_SEPARATOR+(addCharInString(i-1,' ')));
      secondColumn.append(addCharInString((calculateLenghtDigit(result.getSubtrahend().get(i))),'_')+LINE_SEPARATOR);
      if (i>=reminderMinuend){
        createThirdColumn(result);
      }
    }
    return secondColumn;
  }
  public StringBuilder createThirdColumn(Result result) {
    StringBuilder thirdColumn = new StringBuilder();
    thirdColumn.append(addCharInString(calculateLenghtDigit(result.getDividend())-1,' '));
    thirdColumn.append(result.getDifference());
    return thirdColumn;
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
