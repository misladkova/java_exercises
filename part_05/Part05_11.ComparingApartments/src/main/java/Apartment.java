
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;
    private int price;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
        this.price = this.squares*this.pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared){
        int difference = this.price-compared.price;
        return Math.abs(difference);
    }

    public boolean moreExpensiveThan(Apartment compared){
        return this.price > compared.price;
    }

}
