package by.peekhovsky.patterns.grasp.creator;


import java.util.List;


public class Sale {

    private int discountPercent;

    private List<SaleLineItem> saleLineItems;


    public Sale() {
    }

    public Sale(final int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public void addLineItem(Product product, int quantity) {
        saleLineItems.add(new SaleLineItem(product, quantity));
    }

    public List<SaleLineItem> getSaleLineItems() {
        return saleLineItems;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

}
