package abstractfactory.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProviderTest {

    @Test
    public void testProducer(){
        Provider provider  = new MailFactory();
        provider.produce().send();
    }
}