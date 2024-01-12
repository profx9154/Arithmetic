package io.satonkin.foxminded.integerdivision;

public class Division implements Operation {
  private StringBuilder result = new StringBuilder();
  private StringBuilder quotient = new StringBuilder();
  private StringBuilder calculations = new StringBuilder();

  private String addSpaseAndDashBetweenSubtraction(Integer amountDashes, Integer amountSpaces) {
    return addSomeCharInString(amountSpaces, ' ') + addSomeCharInString(calculateLenghtDigit(amountDashes), '-');
  }

  private void addVerticalLineAndDivisorInResult(Integer dividend, Integer divisor) {
    int[] index = new int[3];
    for (int i = 0, j = 0; i < result.length(); i++) {
      if (result.charAt(i)=='\n') {
        index[j] = i;
        j++;
      }
      if (j==3) {
        break;

      }
    }
    int AmountWhitespaceUntilVerticalLine = calculateLenghtDigit(dividend) + 1 - index[0];

    result.insert(index[2], addSomeCharInString(AmountWhitespaceUntilVerticalLine, ' ') + "│" + quotient.toString());
    result.insert(index[1], addSomeCharInString(AmountWhitespaceUntilVerticalLine, ' ') + "│" + addSomeCharInString(quotient.length(), '-'));
    result.insert(index[0], "│" + divisor);
    result.replace(1, index[0], dividend.toString());
  }

  private int calculateLenghtDigit(int i) {
    return (int) Math.log10(i) + 1;
  }


  private String addSomeCharInString(int numberOfSymbols, char symbol) {

    StringBuilder string = new StringBuilder();
    for (int i = 0; i < numberOfSymbols; i++) {
      string.append(symbol);
    }
    return string.toString();
  }

  @Override
  public String performDivision(int dividend, int divisor) {
    String[] stringDivident = String.valueOf(dividend).split("");
    Integer minuend;
    Integer subtrahend;
    Integer numberOfDigitsInDivisor = calculateLenghtDigit(divisor);
    Integer remainderOfTheDivision;
    for (int i = 0; i < stringDivident.length; i++) {
      calculations.append(stringDivident[i]);
      minuend = Integer.parseInt(calculations.toString());
      if (minuend >= divisor) {
        remainderOfTheDivision = minuend % divisor;
        subtrahend = minuend / divisor * divisor;
        String lastMinuend = String.format("%" + (i + 2) + "s", "_" + minuend.toString());
        result.append(lastMinuend).append("\n");
        String lastSubtrahend = String.format("%" + (i + 2) + "d", subtrahend);
        result.append(lastSubtrahend).append("\n");
        Integer lengthDifference = lastMinuend.length() - calculateLenghtDigit(subtrahend);
        result.append(addSpaseAndDashBetweenSubtraction(minuend, lengthDifference)).append("\n");
        quotient.append(minuend / divisor);
        calculations.replace(0, calculations.length(), remainderOfTheDivision.toString());
        minuend = Integer.parseInt(calculations.toString());
      } else {
        if (i >= numberOfDigitsInDivisor) {
          quotient.append(0);
        }
      }
      if (i==stringDivident.length - 1) {
        result.append(String.format("%" + (i + 2) + "s", minuend.toString())).append("\n");
      }
    }
    addVerticalLineAndDivisorInResult(dividend, divisor);
    return result.toString();
  }

  public String startDivision(int dividend, int divisor) {
    if (divisor==0) {
      throw new IllegalArgumentException("Divisor cannot be 0, division by zero");
    } else if (dividend < divisor) {
      throw new IllegalArgumentException("Integer-division is imposible because ,Divisor>Dividend");
    }
    return performDivision(dividend, divisor);
  }
}