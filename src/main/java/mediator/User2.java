package mediator;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class User2 extends User {
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 exec ");
    }
}
