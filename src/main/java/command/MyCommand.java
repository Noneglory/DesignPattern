package command;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class MyCommand  implements Command {
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void command() {
        receiver.action();
    }
}
