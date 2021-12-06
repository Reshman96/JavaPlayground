package challenges.week2.arrayMerge;

public class MergeArrays {

    public static int[] merge(int[][] array) {

        // Calculating the size the merged array (result) needs to be
        int idx = 0;
        for (int[] innerArrays : array) {
            idx += innerArrays.length;
        }
        int[] result = new int[idx];

        // Looping through the 2d array and merging them into a single array (result)
        int count = 0;
        for (int[] innerArray : array) {
            for (int num : innerArray) {
                result[count] = num;
                count++;
            }
        }
        return result;
    }

    public static int[] ascend(int[] array) {

        boolean flag = true;

        while (flag) {
            flag = false;

            // Looping through array and swapping neighbouring elements if necessary.
            // While loop repeats until no further swapping occurs.
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    flag = true;
                }
            }
        }
        return array;
    }

    public static int[] ascend(int[][] array) {
        return ascend(merge(array));
    }

    public static int[] descend(int[] array) {
        int[] ascendedArray = ascend(array);
        int[] result = new int[array.length];
        int count = array.length;

        // Simply flips the order of the ascended array
        for (int num : ascendedArray) {
            result[count - 1] = num;
            count--;
        }
        return result;
    }

    public static int[] descend(int[][] array) {
        return descend(merge(array));
    }
}
