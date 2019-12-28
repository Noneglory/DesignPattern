package abstractfactory.factory;

import abstractfactory.MailSender;
import abstractfactory.Sender;

public class MailFactory implements  Provider {
    public Sender produce() {
        return new MailSender();
    }
}
