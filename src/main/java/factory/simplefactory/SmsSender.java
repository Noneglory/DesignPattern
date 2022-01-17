package factory.simplefactory;

public class SmsSender implements Sender {
    public void send() {
        System.out.println("this is sms class");
    }
}
