import java.util.ArrayList;

public class HashMap<K, V> {

    private ArrayList<Pair<K, V>>[] map;
    private int index;

    public HashMap() {
        this.map = new ArrayList[10];
        this.index = 0;
    }

    public V get(K key) {
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

    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hash = Math.abs(key.hashCode() % map.length);
        if (map[hash] == null) {
            map[hash] = new ArrayList<>();
        }
        return map[hash];
    }

    private int getIndexOfKey(ArrayList<Pair<K, V>> list, K key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public void add(K key, V value) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int idx = getIndexOfKey(valuesAtIndex, key);
        if (idx < 0) {
            valuesAtIndex.add(new Pair<K, V>(key, value));
            index++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
        if(index*1.0/map.length>0.75){
            grow();
        }
    }

    private void copy(ArrayList<Pair<K, V>>[] newMap, int fromIndex) {
        for(int i=0; i<map[fromIndex].size(); i++){
            Pair<K, V> newValue = map[fromIndex].get(i);
            int hash = Math.abs(newValue.getKey().hashCode() % map.length);
            if (newMap[hash] == null) {
                newMap[hash] = new ArrayList<>();
            }
            newMap[hash].add(newValue);
        }
    }

    private void grow() {
        ArrayList<Pair<K, V>> [] newMap = new ArrayList[map.length*2];
        for(int i=0; i< map.length; i++){
            copy(newMap, i);
        }
        this.map = newMap;
    }

    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if(valuesAtIndex.size()==0){
            return null;
        }
        int idx = getIndexOfKey(valuesAtIndex, key);
        if (idx<0){
            return null;
        }
        Pair<K, V> newValue = valuesAtIndex.get(idx);
        valuesAtIndex.remove(newValue);
        return newValue.getValue();
    }


}
