package proxy.dynamicproxy;

import proxy.Source;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyType implements InvocationHandler {
    private Source source;

    public ProxyType(Source source) {
        this.source = source;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxyType start.....");
        return method.invoke(source,args);
    }
}
