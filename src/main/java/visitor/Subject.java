package visitor;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public interface Subject {
    void accept(Visitor visitor);
    String getSubject();
}
