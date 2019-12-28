package proto;

public class ProtoType implements  Cloneable  {
    private int id;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ProtoType clone() throws CloneNotSupportedException {
        ProtoType proto = (ProtoType) super.clone();
        return  proto;
    }

    public String toString(){
        return "id:"+id+"user"+user.hashCode();
    }
}
