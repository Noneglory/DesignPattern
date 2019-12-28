package proxy;

public class Proxy implements SourceAble {
    private SourceAble sourceAble;

    public Proxy() {
        this.sourceAble = new Source();
    }

    public void method1() {
        System.out.println(1111);
        sourceAble.method1();
        System.out.println(2222);
    }
}
