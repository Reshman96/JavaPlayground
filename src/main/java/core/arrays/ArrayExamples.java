package core.arrays;

import java.util.Scanner;

public class ArrayExamples {

    public int[] gameMenuItems = {1, 2, 3, 4, 5};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayExamples arrayExamples = new ArrayExamples();

        System.out.println("Please enter order of numbers 1 to 5 for the menu items: \n");

        for (int i=0; i<arrayExamples.gameMenuItems.length; i++) {
            System.out.println("Game item slot " + (i + 1) + " is: \n");
            int num = scanner.nextInt();
            scanner.nextLine();

            arrayExamples.gameMenuItems[i] = num;
        }

        for (int item : arrayExamples.gameMenuItems) {
            System.out.print(item + ", ");
        }
    }
}
