package factory.abstractfactory.ifactory;

import factory.abstractfactory.iproduct.IPhoneProduct;
import factory.abstractfactory.iproduct.IRouterProduct;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public interface IProduceFactory {
    IPhoneProduct phoneProduce();
    IRouterProduct routerProduce();

}
