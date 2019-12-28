package abstractfactory.factory;

import abstractfactory.Sender;
import abstractfactory.SmsSender;

public class SmsFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
