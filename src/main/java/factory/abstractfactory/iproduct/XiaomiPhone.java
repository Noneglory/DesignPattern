package factory.abstractfactory.iproduct;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class XiaomiPhone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("小米手机：开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机：关机");
    }

    @Override
    public void callUp() {
        System.out.println("小米手机：打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机：发短信");
    }
}
