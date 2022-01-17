package factory.simplefactory.multi;

import factory.simplefactory.MailSender;
import factory.simplefactory.Sender;
import factory.simplefactory.SmsSender;

public class SendFactory {
    public Sender mailSenderProduce(){
        return new MailSender();
    }

    public Sender smsSenderProduce(){
        return  new SmsSender();
    }
}
