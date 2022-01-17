package mediator;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public abstract class User {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
