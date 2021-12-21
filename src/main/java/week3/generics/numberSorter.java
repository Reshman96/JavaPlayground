package week3.generics;

import java.util.Arrays;

public class numberSorter {

    public static <T extends Number> T[] sort(T[] unsortedArray) {
//        T[] sortedArray = (T[]) new Number[unsortedArray.length];
        Arrays.sort(unsortedArray);
        return unsortedArray;
    }

    public static void main(String[] args) {
        Integer[] int1 = new Integer[]{6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(int1)));
    }
}
