package adapter;

public class SubTarget1  implements  Target{

    private Source source = new Source();
    public void method1() {
        source.sourcemethod1();
    }

    public void method2() {
        source.sourcemethod2();
    }
}
