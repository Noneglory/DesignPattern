package interpret;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class InterpretTest {
    public static void main(String args[]){
        int interpret = new Minus().interpret((new Context(new Plus().interpret(new Context(9, 2)), 8)));
        System.out.println(interpret);
    }
}
