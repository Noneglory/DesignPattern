package factory.abstractfactory.ifactory;

import factory.abstractfactory.iproduct.IPhoneProduct;
import factory.abstractfactory.iproduct.IRouterProduct;
import factory.abstractfactory.iproduct.XiaomiPhone;
import factory.abstractfactory.iproduct.XiaomiRouter;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */



public class XiaomiFactory implements IProduceFactory{
    @Override
    public IPhoneProduct phoneProduce() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct routerProduce() {
        return new XiaomiRouter();
    }
}
