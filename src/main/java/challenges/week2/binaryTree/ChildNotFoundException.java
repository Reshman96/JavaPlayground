package challenges.week2.binaryTree;

public class ChildNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return "Child node does not exist!";
    }
}
