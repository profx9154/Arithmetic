package io.satonkin.foxminded.integerdivision;

public class SpanishFormat implements Formatter {
  @Override
  public String format(Result result) {
    StringBuilder output = new StringBuilder();
    output.append(createFirstLine(result));
    output.append(createSecondLine(result));
    System.out.println(output);

    return "";
  }
  public StringBuilder createSecondLine(Result result){
    StringBuilder secondLine=new StringBuilder();
    secondLine.append(addDashToNumber(result.getMinuend().get(1)));

    return secondLine;
  }

  public StringBuilder createFirstLine(Result result){
    StringBuilder firstLine=new StringBuilder();
    firstLine.append(addDashToNumber(result.getDividend()));
    firstLine.append(addVerticalLine());
    firstLine.append(result.getDivisor()+"\n");
    firstLine.append(" "+result.getSubtrahend().get(0));
    firstLine.append(addSomeCharInString(calculateLenghtDigit(result.getDividend())-1,' '));
    firstLine.append(addVerticalLine());
    firstLine.append(addSomeCharInString(calculateLenghtDigit(result.getQuotient()), '_'));
    firstLine.append("\n");
    firstLine.append(addSomeCharInString(1,' '));
    firstLine.append(addSomeCharInString(1,'_'));
    firstLine.append(addSomeCharInString(calculateLenghtDigit(result.getDividend())-1,' '));
    firstLine.append(addVerticalLine());
    firstLine.append(result.getQuotient());
    firstLine.append("\n");
    return firstLine;
  }

  public String addDashToNumber(int number){
    String ouputString="_"+number;
    return ouputString;
  }
  public String addVerticalLine(){
    return "|";
  }

  public String addSomeCharInString(int numberOfSymbols, char symbol) {

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
