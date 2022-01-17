package factory.factorymethod.ifactory;

import org.junit.Test;

public class ProviderTest {

    @Test
    public void testProducer(){
        Provider provider  = new MailFactory();
        provider.produce().send();
    }
}