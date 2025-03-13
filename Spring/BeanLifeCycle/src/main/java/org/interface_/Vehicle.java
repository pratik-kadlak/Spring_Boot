package org.interface_;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Vehicle implements InitializingBean, DisposableBean {
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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this acts as init()...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("this acts as destroy()...");
    }
}

