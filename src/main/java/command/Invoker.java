package command;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.command();
    }
}
