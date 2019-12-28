package bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyBridgeTest {

    @Test
    public void moethod() {
        Bridge myBridge = new MyBridge();
        Sourceable source1 = new SourceSub1();
        myBridge.setSourceable(source1);
         myBridge.method();
    }
}