package beans;

import java.io.Serializable;

public class Author implements Serializable {

    public Author() {
    }
    
    private String name;

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
