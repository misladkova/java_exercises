
public class Program {

    public static void main(String[] args) {
        
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3));

        MagicSquare square = new MagicSquare(3);
        square.placeValue(0, 0, 8);
        square.placeValue(0, 1, 1);
        square.placeValue(0, 2, 6);
        square.placeValue(1, 0, 3);
        square.placeValue(1, 1, 5);
        square.placeValue(1, 2, 7);
        square.placeValue(2, 0, 4);
        square.placeValue(2, 1, 9);
        square.placeValue(2, 2, 2);

        System.out.println(square);

        System.out.println(square.sumsOfDiagonals());
        System.out.println(square.sumsOfColumns());
        System.out.println(square.sumsOfRows());

    }
}
