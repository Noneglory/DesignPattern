package factory.multi;

import factory.MailSender;
import factory.Sender;
import factory.SmsSender;

public class SendFactory {
    public Sender mailSenderProduce(){
        return new MailSender();
    }

    public Sender smsSenderProduce(){
        return  new SmsSender();
    }
}
