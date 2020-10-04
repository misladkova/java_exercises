public class Container {

    private int actualAmount;

    public Container() {
        this.actualAmount = 0;
    }

    public int contains() {
        return actualAmount;
    }

    public void add(int amount) {
        if (amount>0){
            if ((this.actualAmount + amount) > 100) {
                this.actualAmount = 100;
            } else {
                this.actualAmount += amount;
            }
        }
    }

    public void remove(int amount) {
        if (amount>0){
            this.actualAmount -= amount;
            if (this.actualAmount < 0) {
                this.actualAmount = 0;
            }
        }
    }

    public String toString() {
        return this.actualAmount + "/" + 100;
    }
}


