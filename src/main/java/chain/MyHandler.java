package chain;

public class MyHandler extends AbstractHandler  {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void handle() {
        System.out.println(getName());
        if(getHandler()!=null){
            getHandler().handle();
        }
    }
}
