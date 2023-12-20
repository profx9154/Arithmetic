package io.satonkin.foxminded.integerdivision;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticOperationsTest {
    private short ArithmeticException;

    @Test
    void integerDivision(){
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        assertEquals(10, arithmeticOperations.division(20,2));
    }
    @Test
    void divisionByANegativeNumber(){
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        assertEquals(-25, arithmeticOperations.division(150,-6));

    }

    @Test
    void divisionByZero() throws ArithmeticException{
        ArithmeticOperations arithmeticOperations = new ArithmeticOperations();
        assertEquals(ArithmeticException, arithmeticOperations.division(50,0));

    }


}