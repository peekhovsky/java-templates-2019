package by.peekhovsky.patterns.grasp.information_expert;


import java.math.BigDecimal;
import java.util.List;

public class Sale {

    private int discountPercent;

    private List<SaleLineItem> saleLineItems;


    public Sale() {
    }

    public Sale(final int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public BigDecimal getTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (SaleLineItem saleLineItem : saleLineItems) {
            total = total
                    .add(saleLineItem.getProduct().getPrice()
                    .multiply(new BigDecimal(saleLineItem.getQuantity())));
        }
        return total;
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
