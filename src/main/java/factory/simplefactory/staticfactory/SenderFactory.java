package factory.simplefactory.staticfactory;

import factory.simplefactory.MailSender;
import factory.simplefactory.Sender;
import factory.simplefactory.SmsSender;

public class SenderFactory {
    public static Sender mailSenderProduce(){
        return new MailSender();
    }
    public static Sender smsSenderProduce(){
        return new SmsSender();
    }
}
