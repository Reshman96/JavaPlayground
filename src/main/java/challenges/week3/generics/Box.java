package challenges.week3.generics;

// E - Element
// K - Key
// T - Type
// V - Value
// S, U, V etc. - 2nd, 3rd, 4th types

public class Box<T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Resh");
        System.out.println(stringBox.getItem());

        Box<Integer> integerBox;
    }
}
