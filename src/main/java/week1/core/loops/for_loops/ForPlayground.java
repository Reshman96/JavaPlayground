package week1.core.loops.for_loops;

public class ForPlayground {
    private int[] arr = {1, 2, 3, 4, 5, 6, 7};

    public void basicFor() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void forEach() {
        for (int num : arr) {
            System.out.println(num);
        }
    }
}
