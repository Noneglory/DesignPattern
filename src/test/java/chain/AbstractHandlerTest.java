package chain;

import org.junit.Test;

public class AbstractHandlerTest {

    @Test
    public void handle() {
        Handler handler = new MyHandler("h1");
        Handler handler1 = new MyHandler("h2");
        Handler handler2 = new MyHandler("h3");
        ((MyHandler) handler).setHandler(handler1);
        ((MyHandler) handler1).setHandler(handler2);
        handler.handle("h3");
    }
}
