package mediator;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class User1 extends  User {

    public User1(Mediator mediator){
        super(mediator);
    }
    @Override
    public void work() {
        System.out.println("user1 exec");
    }
}
