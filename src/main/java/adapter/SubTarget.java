package adapter;

public class SubTarget extends  Source implements  Target{
    public void method1() {
       this.sourcemethod1();
    }

    public void method2() {
        this.sourcemethod2();
    }
}
