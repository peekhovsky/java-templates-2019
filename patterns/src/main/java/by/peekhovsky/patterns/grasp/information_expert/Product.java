package by.peekhovsky.patterns.grasp.information_expert;


import java.math.BigDecimal;


@SuppressWarnings("WeakerAccess")
public class Product {

    private String name;

    private BigDecimal price;


    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
