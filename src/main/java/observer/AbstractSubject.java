package observer;

public abstract  class AbstractSubject {
    protected WatchRegister watchRegister;


    public WatchRegister getWatchRegister() {
        return watchRegister;
    }

    public void setWatchRegister(WatchRegister watchRegister) {
        this.watchRegister = watchRegister;
    }

    public void doOperate(){
        doAction();
        if(watchRegister==null)
        {
            System.out.println("请配置注册器");
        }
        watchRegister.notifyAll(getClass());
    }

    public abstract  void doAction();

}
