package factory.factorymethod;

import factory.simplefactory.Sender;

public class MailSender implements Sender {
    public void send() {
        System.out.println("this is mailSender");
    }
}
