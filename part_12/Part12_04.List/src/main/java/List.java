public class List<T> {

    private T[] list;
    private int startIndex;

    public List() {
        this.list = (T[]) new Object[10];
        this.startIndex = 0;
    }

    public void add(T value) {
        if (startIndex == list.length) {
            grow();
        }
        this.list[startIndex] = value;
        startIndex++;
    }

    private void grow() {
        int longerList = this.list.length + this.list.length / 2;
        T[] prolongedList = (T[]) new Object[longerList];
        for (int i = 0; i < list.length; i++) {
            prolongedList[i] = list[i];
        }
        this.list = prolongedList;
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < startIndex; i++) {
            if (this.list[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < startIndex - 1; i++) {
            this.list[i] = this.list[i + 1];
        }
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }
        moveToTheLeft(indexOfValue);
        startIndex--;
    }

    public T value(int index) {
        if (index >= this.startIndex || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.startIndex + "]");
        }
        return list[index];
    }

    public int size(){
        return startIndex;
    }


}
