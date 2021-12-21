package week1.fizzbuzz;

import java.util.ArrayList;

public class FizzBuzzGenerator {

    /*
    Print integers 1 to 100, but print "Fizz" if an integer is divisible by 3,
    "Buzz" if an integer is divisible by 5, and "FizzBuzz" if an integer is divisible by both 3 and 5.

     Plan:
     - Loop through integers 1 to 100/n
     - replace numbers with Fizz/Buzz/FizzBuzz where appropriate
     - Arrays/ArrayList - if type String, then ints must be converted
     - Output needs to be possible to test
     */
    
    public ArrayList<String> FizzBuzz(int n) {

        // New arraylist to save all the output
        ArrayList<String> arr = new ArrayList<>();

        // Looping through integers 1 to n, replacing as appropriate and adding to arraylist "arr"
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr.add("FizzBuzz");
            } else if (i % 3 == 0) {
                arr.add("Fizz");
            } else if (i % 5 == 0) {
                arr.add("Buzz");
            } else {
                arr.add("" + i);
            }
        }
        return arr;
    }
}
