package factory.simplefactory.simple;


import org.junit.Test;

public class SimpleFactoryTest {

    @Test
    public void senderProduce() {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.senderProduce("mail").send();
    }
}
