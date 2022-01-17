package factory.factorymethod.ifactory;


import factory.simplefactory.Sender;
import factory.simplefactory.SmsSender;

public class SmsFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
