
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        int r = 0;
        int c = size / 2;
        int value = 1;
        square.placeValue(r, c, value);
        for (value = 2; value <= size * size; value++) {
            int r2 = r - 1;
            int c2 = c + 1;
            Pair<Integer, Integer> pa2 = fix(r2, c2, size);
            r2 = pa2.getR();
            c2 = pa2.getC();
            if (square.readValue(r2, c2) != 0) {
                r++;
                Pair<Integer, Integer> pa = fix(r, c, size);
                r = pa.getR();
                c = pa.getC();
            } else {
                r--;
                c++;
                Pair<Integer, Integer> p = fix(r, c, size);
                r = p.getR();
                c = p.getC();
            }
            square.placeValue(r, c, value);
        }
        return square;
    }

    public Pair<Integer, Integer> fix(int r, int c, int size) {
        r += size;
        r = r % size;
        c += size;
        c = c % size;
        return new Pair<>(r, c);
    }


}
