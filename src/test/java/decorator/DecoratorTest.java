package decorator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecoratorTest {

    @Test
    public void method1() {
        SourceAble source = new Source();
        SourceAble decorator = new Decorator(source);
        decorator.method1();
    }
}