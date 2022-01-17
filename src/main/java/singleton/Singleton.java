package singleton;

public class Singleton {
    private Singleton(){};//私有构造方法
    private static Singleton singleton = new Singleton();
    private static Singleton getInstance(){
        return  singleton;
    }
}
