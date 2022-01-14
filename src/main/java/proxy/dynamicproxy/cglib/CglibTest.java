package proxy.dynamicproxy.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/14
 */
public class CglibTest {
    public static void main(String args[]){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "./debug_info"); // 用于输出CGLIB产生的类
        Programmer programmer = new Programmer();
        ProgammerProxy progammerProxy = new ProgammerProxy();
        //cglib增强器，用来创建动态代理
        Enhancer enhancer = new Enhancer();
        //设置要创建动态代理的类，
        enhancer.setSuperclass(programmer.getClass());
        //设置回调，相当于对被代理类上所有的调用，都会调用callback,而callback则需要实行interceptor（）方法拦截
        enhancer.setCallback(progammerProxy);

        Programmer programmer1 = (Programmer)enhancer.create();
        programmer1.hello();
    }
}
