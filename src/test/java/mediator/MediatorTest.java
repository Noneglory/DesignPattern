package mediator;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class MediatorTest {
    public static void main(String args[]){
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
