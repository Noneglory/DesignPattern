package iterator;

import org.junit.Test;



public class MyCollectionTest {

    @Test
    public void get() {
        MyCollection myCollection = new MyCollection();
        System.out.println(myCollection.get(2));
    }

    @Test
    public void iterator() {
        MyCollection myCollection = new MyCollection();
        MyCollection.Iterator iterator = myCollection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}