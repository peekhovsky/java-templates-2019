package by.peekhovsky.patterns.grasp.creator;


@SuppressWarnings("WeakerAccess")
public class SaleLineItem {

    private Product product;

    private int quantity;


    public SaleLineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public SaleLineItem() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
