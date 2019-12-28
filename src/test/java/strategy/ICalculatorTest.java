package strategy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ICalculatorTest {
    @Test
    public void test(){
        String exp = "8*3";
        ICalculator cal = new Multiply();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}