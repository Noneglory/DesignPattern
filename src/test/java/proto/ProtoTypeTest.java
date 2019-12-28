package proto;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProtoTypeTest {
    @Test
    public void testClone() throws CloneNotSupportedException {
        ProtoType protoType = new ProtoType();
        protoType.setId(11);
        protoType.setUser(new User(123,"浅浅"));
        System.out.println(protoType);
        ProtoType protoType1 =  protoType.clone();
        System.out.println(protoType1);
    }

}