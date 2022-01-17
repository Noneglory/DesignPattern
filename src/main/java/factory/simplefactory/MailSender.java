package factory.simplefactory;

public class MailSender implements  Sender{
    public void send() {
        System.out.println("this is mailSender");
    }
}
