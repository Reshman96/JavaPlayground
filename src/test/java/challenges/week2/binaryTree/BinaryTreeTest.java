package challenges.week2.binaryTree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {
    private BinaryTree tree;

    @BeforeEach
    public void setup() {
        tree = new BinaryTree(new Node(25));
        tree.addElement(17);
        tree.addElement(27);
        tree.addElements(new int[]{43, 26, 14, 19});
    }

    @Test
    public void getRootElementTest() {
        Assertions.assertEquals(25, tree.getRootElement());
    }

    @Test
    public void getNumberOfElementsTest() {
        Assertions.assertEquals(7, tree.getNumberOfElements());
    }

    @Test
    public void findElementTest() {
        Assertions.assertEquals(true, tree.findElement(43));
        Assertions.assertEquals(false, tree.findElement(42));
    }
}
