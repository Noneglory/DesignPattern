package proxy.dynamicproxy.jdk;

import proxy.dynamicproxy.jdk.Source;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyType implements InvocationHandler {
    private Source source;

    public ProxyType(Source source) {
        this.source = source;
    }


    /**
     *
     * @param proxy  为通过jdk生成的动态代理类对象
     * @param method 被代理对象调用的方法
     * @param args 被代理对象调用方法的入参
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxyType start.....");
        System.out.println(proxy.getClass().getName()); //=com.sun.proxy.$Proxy0
        System.out.println(method.toString());//=public abstract void proxy.dynamicproxy.jdk.SourceAble.method1()
        System.out.println(args);// 调method时传入的入参信息
        return method.invoke(source,args);
    }
}
