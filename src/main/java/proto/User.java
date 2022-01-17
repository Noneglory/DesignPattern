package proto;

import java.io.Serializable;

public class User implements Serializable {
    private int name;
    private String school;

    public User(int name, String school) {
        this.name = name;
        this.school = school;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

}
