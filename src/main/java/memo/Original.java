package memo;

public class Original {
    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemen(){
        return new Memento(value);
    }

    public void resotreMemen(Memento memento){
        this.value=memento.getValue();
    }
}
