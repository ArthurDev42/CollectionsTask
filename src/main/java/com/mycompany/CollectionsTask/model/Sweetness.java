package com.mycompany.CollectionsTask.model;

import java.io.Serializable;

public class Sweetness implements Serializable {
    
    int id;
    private String title;
    private SweetnessType type;
    private int weight;
    private int sugarContent;
    private Manufacturer manufacturer;
    private int price;

    public Sweetness(int id, String title, SweetnessType type, int weight, int sugarContent, Manufacturer manufacturer, int price) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.weight = weight;
        this.sugarContent = sugarContent;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SweetnessType getType() {
        return type;
    }

    public void setType(SweetnessType type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweetness{" + "id=" + id + ", title=" + title + ", type=" + type.getType() + 
                ", weight=" + weight + ", sugar content=" + sugarContent +", manufacturer=" + manufacturer.getManufacturerTitle() + ", price=" + price + '}';
    }
    
}
