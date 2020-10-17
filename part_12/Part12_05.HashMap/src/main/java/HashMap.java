import java.util.ArrayList;

public class HashMap<K, V> {

    private ArrayList<Pair<K, V>> [] map;

    public HashMap(){
        this.map = new ArrayList[10];
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % map.length);
        if (map[hash] == null) {
            return null;
        }
        ArrayList<Pair<K, V>> hashValues = map[hash];
        for (Pair<K, V> hashValue : hashValues) {
            if (hashValue.getKey().equals(key)) {
                return hashValue.getValue();
            }
        }
        return null;
    }

    private ArrayList<Pair<K, V>> getListBasedOnKey(K key){
        int hash = Math.abs(key.hashCode() % map.length);
        if (map[hash] == null) {
            map[hash] = new ArrayList<>();
        }
        return map[hash];
    }

    private int getIndexOfKey(ArrayList<Pair<K, V>> list, K key){
        for(int i=0; i< list.size(); i++){
            if(list.get(i).getKey().equals(key)){
                return i;
            }
        }
        return -1;
    }

    public void add(K key, V value){

    }

    private void copy(){

    }

    private void grow(){

    }

    public V remove(K key){

    }



}
