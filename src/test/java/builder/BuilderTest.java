package builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuilderTest {

    @Test
    public void testBuilder(){
        Builder builder = new Builder();
        builder.produceMailSender(5);
        System.out.println();
    }
}