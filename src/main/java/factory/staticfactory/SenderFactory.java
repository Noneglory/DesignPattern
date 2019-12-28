package factory.staticfactory;

import factory.MailSender;
import factory.Sender;
import factory.SmsSender;

public class SenderFactory {
    public static Sender mailSenderProduce(){
        return new MailSender();
    }
    public static Sender smsSenderProduce(){
        return new SmsSender();
    }
}
