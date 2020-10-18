public class Pair<K, V> {

    private K r;
    private V c;

    public Pair(K r, V c){
        this.r = r;
        this.c = c;
    }

    public K getR() {
        return r;
    }

    public V getC() {
        return c;
    }
}
