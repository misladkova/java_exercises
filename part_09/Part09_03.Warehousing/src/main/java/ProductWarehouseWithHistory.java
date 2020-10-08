public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changes;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        setBalance(initialBalance);
        changes = new ChangeHistory();
        changes.add(initialBalance);
    }

    public String history() {
        return changes.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            setBalance(getBalance() + amount);
            changes.add(getBalance());
        } else {
            setBalance(getCapacity());
            changes.add(getBalance());
        }
    }

    @Override
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > getBalance()) {
            double allThatWeCan = getBalance();
            changes.add(getBalance());
            setBalance(0);
            return allThatWeCan;
        }
        setBalance(getBalance() - amount);
        changes.add(getBalance());
        return getBalance();
    }

    public void printAnalysis(){
        System.out.println("Product: "+getName()+"\nHistory: "+changes.toString()+"\nLargest amount of product: "+
                changes.maxValue()+"\nSmallest amount of product: "+changes.minValue()+"\nAverage: "+changes.average());
    }

}

