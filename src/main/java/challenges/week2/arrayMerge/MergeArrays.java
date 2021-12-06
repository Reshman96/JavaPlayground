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
}
