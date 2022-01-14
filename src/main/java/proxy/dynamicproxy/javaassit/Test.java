package proxy.dynamicproxy.javaassit;

import javassist.*;

import java.lang.reflect.Constructor;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/14
 */
public class Test {
    public static void main(String args[]) throws Exception {
        creatProxy();
    }

    /**
     * 手动创建字节码
     */
    private static void creatProxy() throws Exception {
        ClassPool pool = ClassPool.getDefault();
        //创建类
        CtClass cc = pool.makeClass("proxy.dynamicproxy.javaassit.StationProxy");

        //设置接口
        CtClass interface1 = pool.get("proxy.dynamicproxy.javaassit.TicketService");
        cc.setInterfaces(new CtClass[]{interface1});

        //设置Field
        CtField field = CtField.make("private proxy.dynamicproxy.javaassit.TicketServiceImpl station;", cc);
        cc.addField(field);

        //创建构造器
        CtClass stationClass = pool.get("proxy.dynamicproxy.javaassit.TicketServiceImpl");
        CtClass[] arrays = {stationClass};
        CtConstructor ctc = CtNewConstructor.make(arrays, null, CtNewConstructor.PASS_NONE, null, null, cc);
        //设置构造函数内部信息
        ctc.setBody("{this.station=$1;}");
        cc.addConstructor(ctc);

        //创建5个方法
        //创建收取手续费方法
        CtMethod takeHandlingFee = CtMethod.make("private void takeHandlingFee() {}", cc);
        takeHandlingFee.setBody("System.out.println(\"收取手续费，打印发票。。。。。\");");
        cc.addMethod(takeHandlingFee);

        //创建showAlertInfo方法
        CtMethod showInfo = CtMethod.make("private void showAlertInfo(String info) {}", cc);
        showInfo.setBody("System.out.println($1);");
        cc.addMethod(showInfo);

        //创建sellTicket
        CtMethod sellTicket = CtMethod.make("public void sellTicket(){}", cc);
        //"{this.showAlertInfo 都是在调用这些方法，括号中传入需print的string
        //但proxy对象中，sellTicket方法并未执行，而是执行的动态代理中method的流程
        sellTicket.setBody("{this.showAlertInfo(\"showAlertInfo********\");" + "station.sellTicket();"
                + "this.takeHandlingFee();" + "this.showAlertInfo(\"××××BYBY！××××\");}");
        cc.addMethod(sellTicket);

        //创建inquire方法
        CtMethod inquire = CtMethod.make("public void inquire() {}", cc);
        inquire.setBody("{this.showAlertInfo(\"××××欢迎光临本代售点，问询服务不会收取任何费用，本问询信息仅供参考，具体信息以车站真实数据为准！××××\");"
                + "station.inquire();" + "this.showAlertInfo(\"××××欢迎您的光临，再见！××××\");}");
        cc.addMethod(inquire);

        //创建widthraw方法
        CtMethod withdraw = CtMethod.make("public void withdraw() {}", cc);
        withdraw.setBody("{this.showAlertInfo(\"××××欢迎光临本代售点，退票除了扣除票额的20%外，本代理处额外加收2元手续费！××××\");"
                + "station.withdraw();" + "this.takeHandlingFee();}");

        //获取动态生成的class
        Class<?> c = cc.toClass();
        //获取构造器
        Constructor<?> constructor = c.getConstructor(TicketServiceImpl.class);
        TicketService o = (TicketService)constructor.newInstance(new TicketServiceImpl());
        o.sellTicket();

        //CtClass cc = pool.makeClass("proxy.dynamicproxy.javaassit.StationProxy"); 类的全限定名称
        //文件就会在这里E:/code/PatternDesign/src/main/java/proxy/dynamicproxy/javaassit/StationProxy.class
        cc.writeFile("E://code//PatternDesign//src//main//java");

    }
}
