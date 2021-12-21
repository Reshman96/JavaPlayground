package week3.nested_classes;

public class OuterClass {

    private String privateOuter = "This is a private OuterClass variable";
    public String publicOuter = "This is a public OuterClass variable";
    private static String privateStaticOuter = "This is a private static OuterClass variable";
    public static String publicStaticOuter = "This is a public static OuterClass variable";

    public class InnerClass {

        public InnerClass() {
            System.out.println(privateOuter);
            System.out.println(publicOuter);
            System.out.println(privateStaticOuter);
            System.out.println(publicStaticOuter);
        }
    }

    public static class InnerClassTwo {

        public InnerClassTwo() {
//            System.out.println(privateOuter);
//            System.out.println(publicOuter);
            System.out.println(privateStaticOuter);
            System.out.println(publicStaticOuter);
        }
    }

    public static void main(String[] args) {
        new OuterClass().new InnerClass();
//        new OuterClass().new InnerClassTwo();
    }
}
