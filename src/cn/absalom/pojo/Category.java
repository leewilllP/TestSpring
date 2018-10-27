package cn.absalom.pojo;

import org.springframework.stereotype.Component;

@Component("c")
public class Category {
    private String name = "category1";
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
