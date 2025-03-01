package org.lifecycle;

public class Vehicle {
    private String model;
    private int price;

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(int price){
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

    public void init(){
        System.out.println("inside init()...");
    }

    public void destroy(){
        System.out.println("inside destroy()...");
    }
}
