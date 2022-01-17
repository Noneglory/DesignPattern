package factory.abstractfactory.ifactory;

import factory.abstractfactory.iproduct.HuaweiPhone;
import factory.abstractfactory.iproduct.HuaweiRouter;
import factory.abstractfactory.iproduct.IPhoneProduct;
import factory.abstractfactory.iproduct.IRouterProduct;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */

public class HuaweiFactory implements IProduceFactory{
    @Override
    public IPhoneProduct phoneProduce() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct routerProduce() {
        return new HuaweiRouter();
    }
}
