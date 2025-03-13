package org.annotation_;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Vehicle {
    private String model;
    private int price;

    public void setModel(String model){
        System.out.println("setting model...");
        this.model = model;
    }

    public void setPrice(int price){
        System.out.println("setting price...");
        this.price = price;
    }

    public String getModel(){
        return this.model;
    }

    public int getPrice(){
        return this.price;
    }

    public Vehicle(String model, int price){
        super();
        this.model = model;
        this.price = price;
    }

    public Vehicle(){
        super();
    }

    @Override
    public String toString(){
        return "Vehicle [Model: " + this.model + ", Price: " + this.price + "]";
    }

    @PostConstruct
    public void init(){
        System.out.println("inside init()...");
    }

    @PreDestroy()
    public void destroy(){
        System.out.println("inside destroy()...");
    }

}

