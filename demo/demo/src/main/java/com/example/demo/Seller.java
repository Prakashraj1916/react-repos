package com.example.demo;

import jakarta.persistence.*;

import java.util.Collections;
import java.util.List;

@Entity
public class Seller {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private long num;
    private String address;
    @OneToMany(cascade =CascadeType.ALL)
    private List<Product> pro;

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

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product>getPro() {
        return pro;
    }

    public void setPro(List<Product> pro) {
        this.pro= pro;
    }


}
