package io.satonkin.foxminded.integerdivision;

import io.satonkin.foxminded.integerdivision.calculator.Calculator;
import io.satonkin.foxminded.integerdivision.formater.Formatter;
import io.satonkin.foxminded.integerdivision.formater.FormatterFactory;
import io.satonkin.foxminded.integerdivision.model.Result;

public class Main {
  public static void main(String[] args) throws Exception {
    Calculator calculator = new Calculator();
    Result result = calculator.divide(500, 2);
    Formatter spanishFormatter = FormatterFactory.creatrFormatter("Spanish");
    System.out.println(spanishFormatter.format(result));
    System.out.println(" ");
    Formatter germanFormatter = FormatterFactory.creatrFormatter("German");
    System.out.println(germanFormatter.format(result));


  }
}
