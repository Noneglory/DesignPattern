package visitor;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class MySubject implements Subject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getSubject() {
        return "helloWorld";
    }
}
