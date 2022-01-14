package proxy.dynamicproxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/14
 */
public class ProgammerProxy  implements MethodInterceptor {
    /**
     * @param obj    代理对象本身
     * @param method 被代理对象的方法
     * @param args   函数调用的参数
     * @param proxy  方法的代理
     * @return
     * @throws Throwable
     */
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        /**
         * proxy为方法代理对象
         * 1：proxy.invoke(Object obj, Object[] args)函数的语义是底层调用被代理类中相同方法
         * 2：proxy.invokeSuper(Object obj, Object[] args)函数的语义是底层调用代理类中相同方法
         *
         * 1会导致栈溢出，是给外部调用的
         * 2：才是动态代理真正调的接口
         */
        proxy.invokeSuper(obj, args);
        System.out.println(obj.getClass().getName()); //动态代理类对象 proxy.dynamicproxy.cglib.Programmer$$EnhancerByCGLIB$$18fd1da
        System.out.println(method); //方法名称 public void proxy.dynamicproxy.cglib.Programmer.hello()
        System.out.println(args);//入参对象  [Ljava.lang.Object;@1b4fb997
        System.out.println(proxy.toString()); //net.sf.cglib.proxy.MethodProxy@deb6432
        return null;
    }


}
