public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.quantity = qty;
        this.unitPrice = unitPrice;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public String getProduct() {
        return product;
    }

    public int price(){
        return quantity*unitPrice;
    }

    public void increaseQuantity(){
        quantity++;
    }

    public String toString(){
        return product+": "+quantity;
    }


}

