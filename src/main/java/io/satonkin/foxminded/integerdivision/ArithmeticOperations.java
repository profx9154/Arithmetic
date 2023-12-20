package io.satonkin.foxminded.integerdivision;

public class ArithmeticOperations {
    public int division(int dividend, int divisor) {

        int quotient = 0;
        try {
            quotient = dividend / divisor;

        } catch (ArithmeticException DivideByZero) {
            System.out.println("You can't divide by zero");
        }
        return quotient;
    }
}