package com.codewithlei.dependency_injection;

public class Car {
    private String model;
    private String name;
    private String color;

    public Car(String color, String model, String name) {
        this.color = color;
        this.model = model;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
