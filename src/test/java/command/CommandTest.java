package command;

/**
 * describe:
 *
 * @author leijiang
 * @date 2022/01/17
 */
public class CommandTest {
    public static void main(String args[]){
        Receiver receiver = new Receiver();
        MyCommand myCommand = new MyCommand(receiver);
        Invoker invoker = new Invoker(myCommand);
        invoker.action();
    }
}
