package factory.factorymethod.ifactory;


import factory.simplefactory.MailSender;
import factory.simplefactory.Sender;

public class MailFactory implements  Provider {
    public Sender produce() {
        return new MailSender();
    }
}
