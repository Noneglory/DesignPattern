package state;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {
    @Test
    public void testContext(){
        State state = new State();
        state.setValue("state1");
        Context context = new Context(state);
        context.method();

    }
}