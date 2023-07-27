package dev.lpa;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> list;

    public Customer(String name, ArrayList<Double> list) {
        this.name = name;
        this.list = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getList() {
        return list;
    }
}
