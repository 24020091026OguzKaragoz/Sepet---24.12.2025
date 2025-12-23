package org.t3tracon.classes;

public class Textile extends Product {
    private String fabricType, size, manufacturer;

    public Textile() {}
    public Textile(String name, Double price, String fabricType, String size, String manufacturer) {
        super(name, price);
        this.fabricType = fabricType;
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public String getFabricType() {
        return fabricType;
    }

    public void setFabricType(String fabricType) {
        this.fabricType = fabricType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
