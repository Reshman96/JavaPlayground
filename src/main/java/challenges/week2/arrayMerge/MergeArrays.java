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
}
