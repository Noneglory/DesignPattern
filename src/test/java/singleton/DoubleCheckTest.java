package singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleCheckTest {

    @Test
    public void getInstance() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(DoubleCheck.getInstance());
        }
    }
}