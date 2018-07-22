package com.springbootdemo.Entity;

import java.util.Currency;

public class Product {

    private int id;
    private String name;
    private Currency value;

    public Product(int id, String name, Currency value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

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

    public Currency getValue() {
        return value;
    }

    public void setValue(Currency value) {
        this.value = value;
    }
}
