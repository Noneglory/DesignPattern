package visitor;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class VisitorTest {
    public static void main(String args[]){
        MyVisitor myVisitor = new MyVisitor();
        MySubject mySubject = new MySubject();
        mySubject.accept(myVisitor);
    }
}
