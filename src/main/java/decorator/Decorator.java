package decorator;

public class Decorator implements  SourceAble {
    private SourceAble sourceAble;

    public Decorator(SourceAble sourceAble) {
        this.sourceAble = sourceAble;
    }

    public void method1() {
        System.out.println(1111);
        sourceAble.method1();
        System.out.println(2222);
    }
}
