package challenges.week2.fibonacciSequence;

public class FibonacciSequence {

    public static int[] make(int firstNumber, int secondNumber, int totalNumbers) {
        int[] result = new int[totalNumbers];
        result[0] = firstNumber;
        result[1] = secondNumber;
        for (int i = 2; i < totalNumbers; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }
}
