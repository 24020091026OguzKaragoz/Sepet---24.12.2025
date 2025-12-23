package org.t3tracon.classes;
import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Product {
    private String name;
    private Double price;

    public Product() {}
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal calculateKdvAmount(BigDecimal price, BigDecimal kdvRate) {
        if (price == null || kdvRate == null) return BigDecimal.ZERO;

        return price.multiply(kdvRate)
                .divide(new BigDecimal("100"), 2, RoundingMode.HALF_UP);
    }

}
