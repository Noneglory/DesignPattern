package factory.abstractfactory.iproduct;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */

public class HuaweiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("华为路由器：开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器：关机");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器：打开wifi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器：设置");
    }
}
