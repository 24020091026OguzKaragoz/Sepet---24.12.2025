package org.t3tracon.classes;

public class Bread extends Product {
    private String type;
    private Double weight;

    public Bread() {}
    public Bread(String name, Double price, String type, Double weight) {
        super(name, price);
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
