package singleton;

public class Singleton {
    private Singleton(){}
    private static Singleton singleton = new Singleton();
    private static Singleton getInstance(){
        return  singleton;
    }
}
