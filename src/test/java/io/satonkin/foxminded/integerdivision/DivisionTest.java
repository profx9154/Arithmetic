package io.satonkin.foxminded.integerdivision;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionTest {
  Division division=new Division();
  @Test
  void testHowShouldMakeDivision() {
    String expected="_999│52\n" +
      " 52 │--\n" +
      " -- │19\n" +
      "_479\n" +
      " 468\n" +
      " ---\n" +
      "  11"+
      "\n";
    assertEquals(expected, division.startDivision(999, 52));
  }
  @Test
  void testDivisorMoreDividend() {
    assertThrows(IllegalArgumentException.class, () -> {
      division.startDivision(100,999);
    });
  }
  @Test
  void testDivisorByZero() throws IllegalArgumentException {
    assertThrows(IllegalArgumentException.class, () -> {
      division.startDivision(999,0);
    });
  }
}