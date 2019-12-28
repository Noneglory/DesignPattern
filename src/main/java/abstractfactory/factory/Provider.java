package abstractfactory.factory;

import abstractfactory.Sender;

public interface Provider {
    Sender produce();
}
