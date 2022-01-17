package memo;

import org.junit.Test;

public class OriginalTest {

    @Test
    public void Memen() {
        Original original = new Original("小明");
        System.out.println(original.getValue());
        //保存   original.createMemen() 创建备忘录
        Storage storage = new Storage(original.createMemen());

        //修改
        original.setValue("浅浅");
        System.out.println(original.getValue());

        //回复
        original.resotreMemen(storage.getMemento());
        System.out.println(original.getValue());
    }
}