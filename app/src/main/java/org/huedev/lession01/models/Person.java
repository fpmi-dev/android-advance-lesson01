package org.huedev.lession01.models;

public class Person {
    private String img;
    private String name;
    private String desc;

    public Person(String img, String name, String desc) {
        this.img = img;
        this.name = name;
        this.desc = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
