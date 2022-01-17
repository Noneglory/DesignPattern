package factory.abstractfactory;

import factory.abstractfactory.ifactory.HuaweiFactory;
import factory.abstractfactory.ifactory.IProduceFactory;
import factory.abstractfactory.ifactory.XiaomiFactory;
import factory.abstractfactory.iproduct.IPhoneProduct;
import factory.abstractfactory.iproduct.IRouterProduct;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */


public class Consumer {
    public static void main(String[] args) {
        IProduceFactory xiaomiFactory = new XiaomiFactory();
        IPhoneProduct xiaomiPhoneProduct = xiaomiFactory.phoneProduce();
        xiaomiPhoneProduct.start();

        IProduceFactory huaweiFactory = new HuaweiFactory();
        IRouterProduct iRouterProduct = huaweiFactory.routerProduce();
        iRouterProduct.openWifi();
    }
}
