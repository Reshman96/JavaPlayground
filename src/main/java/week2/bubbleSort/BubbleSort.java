package week2.bubbleSort;

import java.util.List;

public class BubbleSort {
    private static int counter;
    private static long time;

    public static List<Integer> sort(List<Integer> list) {

        time = 0;
        long start = System.nanoTime();
        boolean flag = true;
        counter = 0;

        while(flag) {

            // Turning the flag off so that the while loop only plays once unless it's changed later
            flag = false;

            // Looping through the list and checking neighbouring elements
            for (int i = 1; i < list.size(); i++) {

                // Every time the loop occurs, the counter increments by 1
                counter ++;

                // If the current element in the list is smaller than the previous element, swap them around
                if (list.get(i) < list.get(i - 1)) {
                    int tempNum = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, tempNum);

                    // Flag changed to true so that the process can repeat since there may be more swapping necessary
                    flag = true;
                }
            }
        }
        long end = System.nanoTime();
        time = (end - start) / 1000;
        return list;
    }

    public static int getCounter() {
        return counter;
    }

    public static void displayCounter() {
        System.out.println(BubbleSort.getCounter() + " iterations");
    }

    public static long getTime() {
        return time;
    }

    public static void displayTime() {
        System.out.println("Executed in " + BubbleSort.getTime() + " milliseconds." );
    }

}