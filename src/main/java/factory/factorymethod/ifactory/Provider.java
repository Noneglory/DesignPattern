package factory.factorymethod.ifactory;


import factory.simplefactory.Sender;

public interface Provider {
    Sender produce();
}
