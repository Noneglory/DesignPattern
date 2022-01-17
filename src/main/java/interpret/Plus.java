package interpret;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class Plus implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getNum1()+context.getNum2();
    }
}
