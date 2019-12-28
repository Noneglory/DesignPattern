package factory;

import factory.Sender;

public class SmsSender implements Sender {
    public void send() {
        System.out.println("this is sms class");
    }
}
