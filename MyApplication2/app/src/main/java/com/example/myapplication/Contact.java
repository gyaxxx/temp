package com.example.myapplication;

import java.util.ArrayList;

public class Contact {

    private int id;
    private String images;
    private String name;
    private String phone;

    public Contact() {

    }
    public Contact(int id, String images, String name, String phone) {
        this.id = id;
        this.images = images;
        this.name = name;
        this.phone = phone;
    }
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getImages() {return this.images; }
    public String getPhone() {
        return this.phone;
    }
}
