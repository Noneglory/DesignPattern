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
    public void handle(String name ) {
        if(name.equals(getName())){
            System.out.println("这个是我的职责，再这里进行处理了");
            System.out.println(this.hashCode()+"我的职责是"+getName());
            return;
        }else{
            if(getHandler()!=null){
                System.out.println("不符合我的职责，传递给下一位:"+getHandler().hashCode());
                getHandler().handle(name);
            }

        }
    }
}
