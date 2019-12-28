package singleton;

public class Singleton2 {
    private static Singleton2 singleton2;
    //构造器私有，防止从外部创建该对象
    private Singleton2(){}
    private static  Singleton2 getInstance(){
        if(singleton2==null)
            singleton2 = new Singleton2();
        return  singleton2;
    }

}
