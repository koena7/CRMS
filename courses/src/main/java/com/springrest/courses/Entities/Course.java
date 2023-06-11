package com.springrest.courses.Entities;

public class Course {
    private long id;
    private String name;
    private String desc;


    public Course() {
    }


    public Course(long id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
    }


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
