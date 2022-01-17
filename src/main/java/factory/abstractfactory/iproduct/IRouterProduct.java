package factory.abstractfactory.iproduct;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public interface IRouterProduct {
    //路由器开机
    void start();
    //路由器关机
    void shutdown();
    //开启wifi
    void openWifi();
    //路由器设置
    void setting();
}
