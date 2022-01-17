package factory.factorymethod.ifactory;


import factory.simplefactory.Sender;

public class ImFactory implements Provider {
    public Sender produce() {
        return  new Imsender();
    }
}
