package io.satonkin.foxminded.integerdivision;

public class GermanFormat implements Formatter{
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
    firstColumn.append(result.getDividend()+" "+"÷"+result.getDivisor()+" "+"=>"+" "+ result.getQuotient());
    return firstColumn;
  }
  public StringBuilder createSecondColumn(Result result) {
    StringBuilder secondColumn = new StringBuilder();
    return secondColumn;
  }
  public StringBuilder createThirdColumn(Result result) {
    StringBuilder thirdColumn = new StringBuilder();
    return thirdColumn;
  }

}
