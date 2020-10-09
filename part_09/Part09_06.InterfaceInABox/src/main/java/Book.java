public class Book implements Packable {

    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double weight() {
        return getWeight();
    }

    public String toString(){
        return this.author+": "+this.name;
    }
}
