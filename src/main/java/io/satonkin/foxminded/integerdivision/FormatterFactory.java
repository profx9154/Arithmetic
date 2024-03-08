package io.satonkin.foxminded.integerdivision;

public class FormatterFactory {
  public static Formatter creatrFormatter(String string) {
    if (string.equals("Spanish")) {
      return new SpanishFormat();
    }
    else if (string.equals("German")) {
      return new GermanFormat();
    }
    throw new IllegalArgumentException("choose a format from the suggested ones");
  }
}
