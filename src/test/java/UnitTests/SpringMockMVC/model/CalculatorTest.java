package UnitTests.SpringMockMVC.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void ShouldReturn0WhenNoValueWereGiven(){
        Calculator calculator = new Calculator();

        double sum = calculator.sum();

        Assertions.assertEquals(0, sum);
    }
    @Test
    public void ShouldReturnTheSomeOfTheGivenValue(){
        Calculator calculator = new Calculator();

        double sum = calculator.sum(5,9);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void ShouldThrowAnExceptionWhenTheGivenNumberWereLessThan0(){
        Calculator calculator = new Calculator();

        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));

        Assertions.assertEquals("there is no square root for negative numbers", exception.getMessage());

    }
    @Test
    public void ShouldReturnTheSquareRootoftheGivenNumber(){
        Calculator calculator = new Calculator();

        double result = calculator.squareRoot(4);

        Assertions.assertEquals(2, result );

    }
    @Test
    public void ShouldReturnTrueWhenTheGivenNumberIsOdd(){
        Calculator calculator = new Calculator();

        boolean number = calculator.isOdd(3);

        Assertions.assertTrue(number);

    }
    @Test
    public void ShouldReturnFalseWhenTheGivenNumberIsEven(){
        Calculator calculator = new Calculator();

        boolean number = calculator.isOdd(2);

        Assertions.assertFalse(number);

    }
}
