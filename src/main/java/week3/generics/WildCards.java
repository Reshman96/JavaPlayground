package week3.generics;

public class WildCards {
    private static void printTheBox(Box<? super Integer> box) {
        System.out.println("The box contains " + box.getItem());
    }

    public static void main(String[] args) {
        Box<Number> stringBox = new Box<>();

        printTheBox(stringBox);
    }
}
