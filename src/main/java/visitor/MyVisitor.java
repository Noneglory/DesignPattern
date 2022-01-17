package visitor;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class MyVisitor implements Visitor{

    @Override
    public void visit(Subject subject) {
        System.out.println("visit the subject "+subject.getSubject());
    }
}
