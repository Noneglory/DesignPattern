package abstractfactory;

import abstractfactory.Sender;

public class Imsender implements Sender {
    public void send() {
        System.out.println("this is Im Sender");
    }
}
