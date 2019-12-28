package template;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractCalculatorTest {

    @Test
    public void calculate() {
        AbstractCalculator calculator = new MyCalculator();
        int result= calculator.calculate("1+2","\\+");
        System.out.println(result);

    }
}