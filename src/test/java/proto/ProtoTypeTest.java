package proto;

import org.junit.Test;

import java.io.IOException;

public class ProtoTypeTest {
    /**
     * 浅复制
     * @throws CloneNotSupportedException
     */
    @Test
    public void testClone() throws CloneNotSupportedException {
        ProtoType protoType = new ProtoType();
        protoType.setId(11);
        protoType.setUser(new User(123,"浅浅"));
        System.out.println(protoType);
        ProtoType protoType1 =  protoType.clone();
        System.out.println(protoType1);
    }

    /**
     * 深复制
     * @throws CloneNotSupportedException
     */
    @Test
    public void testDeepClone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        ProtoType protoType = new ProtoType();
        protoType.setId(11);
        protoType.setUser(new User(123,"浅浅"));
        System.out.println(protoType);
        ProtoType protoType1 = (ProtoType) protoType.deepClone();
        System.out.println(protoType1);
    }

}