package observer;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractSubjectTest {

    @Test
    public void doOperate() {
        WatchRegister register = new WatchRegister();
        register.Register(MySubject.class,new observer1());
        register.Register(MySubject.class,new observer2());
        AbstractSubject subject = new MySubject();
        subject.setWatchRegister(register);
        subject.doOperate();

    }
}