package com.edutjl.java;

/**
 * @author jjl
 * @data 2020/1/6 - 23:02
 */

public class Hello {
   private String name;
   private int id;
   private String uid;

    public Hello(String name, int id, String uid) {
        this.name = name;
        this.id = id;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
