package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WatchRegister {
    public Map<Class, ArrayList<Observer>> map  =new HashMap<Class,ArrayList<Observer>>();
    public void Register(Class clazz,Observer observer){
        ArrayList<Observer> list = map.get(clazz);
        if(list==null){
            list = new ArrayList<Observer>();
        }
        list.add(observer);
        map.put(clazz,list);
    }

    public void notifyAll(Class clazz){
        for(Class keyClazz:map.keySet())
        {
                if(keyClazz.getName().equals(clazz.getName())){
                    map.get(clazz).forEach(observer1 ->{observer1.notifyMessage();});
                }
        }
    }
}
