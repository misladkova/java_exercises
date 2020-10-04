import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void sort(int[] array){
        Arrays.sort(array);
    }

    public static void sort(String[] array){
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers){
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings){
        Collections.sort(strings);
    }

    public static void main(String[] args) {

        int[] array = {3, 1, 5, 99, 3, 12};
        String[] array1 = {"g", "v", "a"};

        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        integers.add(9);
        integers.add(90);
        integers.add(3);

        strings.add("cat");
        strings.add("dog");
        strings.add("ape");

        Main.sort(array);
        System.out.println(Arrays.toString(array));

        Main.sort(array1);
        System.out.println(Arrays.toString(array1));

        Main.sortIntegers(integers);
        System.out.println(integers);

        Main.sortStrings(strings);
        System.out.println(strings);
        

    }



}



