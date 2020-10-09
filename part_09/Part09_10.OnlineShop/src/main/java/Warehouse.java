import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> warehouse;
    private Map<String, Integer> stockWarehouse;

    public Warehouse(){
        this.warehouse = new HashMap<>();
        this.stockWarehouse = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        warehouse.put(product, price);
        stockWarehouse.put(product, stock);
    }

    public int price(String product){
        return warehouse.getOrDefault(product, -99);
    }

    public int stock(String product){
        return stockWarehouse.getOrDefault(product, 0);
    }

    public boolean take(String product){
        if(stock(product)<=0){
            return false;
        }
        stockWarehouse.replace(product, stock(product)-1);
        return true;
    }

    public Set<String> products(){
        Set<String> set = new HashSet<>();
        for (String key: stockWarehouse.keySet()){
            set.add(key);
        }
        return set;
    }

}




