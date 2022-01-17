package factory.abstractfactory.iproduct;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
// I 表示接口  phone表示手机， product 产品
public interface IPhoneProduct {
    //手机开机
    void start();
    //手机关机
    void shutdown();
    //手机打电话
    void callUp();
    //手机发短信
    void sendSMS();

}
