
public class MainProgram {

    public static void main(String[] args) {
        
        Product table = new Product("Table");
        Product bottle = new Product("Bottle", "desk");
        Product cellphone = new Product("Cellphone", "box", 2);
        Product coat = new Product("Coat", 3);

        System.out.println(coat);
        System.out.println(cellphone);
        System.out.println(bottle);
        System.out.println(table);

    }
}
