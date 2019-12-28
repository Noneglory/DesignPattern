package abstractfactory.factory;

import abstractfactory.Imsender;
import abstractfactory.Sender;
import abstractfactory.factory.Provider;

public class ImFactory implements Provider {
    public Sender produce() {
        return  new Imsender();
    }
}
