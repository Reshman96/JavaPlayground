package week2.factory;

public class Main {
    public static void main(String[] args) {
        Speakable myDog = AnimalFactory.getAnimal("goldfish");
        System.out.println(myDog.getClass());
        System.out.println(myDog.speak());
    }
}
