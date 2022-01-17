package factory.factorymethod.ifactory;


import factory.simplefactory.Sender;

public class Imsender implements Sender {
    public void send() {
        System.out.println("this is Im Sender");
    }
}
