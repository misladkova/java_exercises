import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void add(String product, int price) {
        for (Item item : cart) {
            if (item.getProduct().equals(product) && item.getUnitPrice() == price) {
                item.increaseQuantity();
                return;
            }
        }
        Item it = new Item(product, 1, price);
        cart.add(it);
    }

    public int price() {
        int sum = 0;
        for (Item it : cart) {
            sum += it.price();
        }
        return sum;
    }

    public void print(){
        for (Item item : cart) {
            System.out.println(item);
        }
    }
}


