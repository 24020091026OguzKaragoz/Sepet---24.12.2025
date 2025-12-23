package org.t3tracon.classes;

public class MobilePhone extends Product {
    private String brand, properties;

    public MobilePhone() {}
    public MobilePhone(String name, Double price, String brand, String properties) {
        super(name, price);
        this.brand = brand;
        this.properties = properties;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
