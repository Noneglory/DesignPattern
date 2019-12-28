package proxy.dynamicproxy;


import proto.ProtoType;
import proxy.Source;
import proxy.SourceAble;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String args[]){
        Source source = new Source();
        SourceAble type =(SourceAble)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{SourceAble.class}, new ProxyType(source));
        type.method1();
    }
}
