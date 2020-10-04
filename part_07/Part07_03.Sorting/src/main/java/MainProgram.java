import java.util.Arrays;

public class MainProgram {

    public static int smallest(int[] array) {
        int najmensi = array[0];
        for (int j : array) {
            if (najmensi > j) {
                najmensi = j;
            }
        }
        return najmensi;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        for (index = 0; index < array.length; index++) {
            if (array[index] == smallest(array)) {
                return index;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int najmensi = array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if (najmensi > array[i]) {
                najmensi = array[i];
            }
        }
        int index = startIndex;
        for (index = startIndex; index < array.length; index++) {
            if (array[index] == najmensi) {
                return index;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }

    public static void sort(int[] array){
        for (int startIndex = 0; startIndex<array.length; startIndex++){
            int index = indexOfSmallestFrom(array, startIndex);
            swap(array, startIndex, index);
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {

        int[] numbers = {3, 1, 5, 99, 3, 12};

        System.out.println(MainProgram.smallest(numbers));

        System.out.println(MainProgram.indexOfSmallest(numbers));

        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 5));

        MainProgram.swap(numbers, 3, 5);
        System.out.println(Arrays.toString(numbers));

        MainProgram.sort(numbers);
    }

}
