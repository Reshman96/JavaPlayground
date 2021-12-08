package challenges.week2.binaryTree;

public class BinaryTree implements iBinaryTree {
    private final Node root;
    private Node currentElement;

    public BinaryTree(Node root) {
        this.root = root;
        this.currentElement = root;
    }

    @Override
    public int getRootElement() {
        return this.root.getNumericValue();
    }

    @Override
    public int getNumberOfElements() {
        return getNumberOfElementBranches(root) + 1;
    }

    private int getNumberOfElementBranches(Node element) {
        int count = 0;
        if (element.getLeftNode() != null) {
            count += getNumberOfElementBranches(element.getLeftNode()) + 1;
        }
        if (element.getRightNode() != null) {
            count += getNumberOfElementBranches(element.getRightNode()) + 1;
        }
        return count;
    }

    @Override
    public void addElement(int element) {
        currentElement = root;
        while (element != currentElement.getNumericValue()) {
            if (element > currentElement.getNumericValue()) {
                if (currentElement.getRightNode() != null) {
                    currentElement = currentElement.getRightNode();
                } else {
                    currentElement.setRightNode(new Node(element));
                }
            }
            if (element < currentElement.getNumericValue()) {
                if (currentElement.getLeftNode() != null) {
                    currentElement = currentElement.getLeftNode();
                } else {
                    currentElement.setLeftNode(new Node(element));
                }
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    @Override
    public boolean findElement(int value) {
        currentElement = root;
        while (currentElement.getLeftNode() != null || currentElement.getRightNode() != null) {
            if (currentElement.getNumericValue() == value) {
                return true;
            } else {
                if (value > currentElement.getNumericValue()) {
                    if (currentElement.getRightNode() == null) {
                        return false;
                    } else {
                        currentElement = currentElement.getRightNode();
                    }
                } else {
                    if (currentElement.getLeftNode() == null) {
                        return false;
                    } else {
                        currentElement = currentElement.getLeftNode();
                    }
                }
            }
        }
        return currentElement.getNumericValue() == value;
    }

    @Override
    public int getLeftChild(int element) {
        if (findElement(element)) {
            return currentElement.getLeftNode().getNumericValue();
        }
        return -1;
    }

    @Override
    public int getRightChild(int element) {
        if (findElement(element)) {
            return currentElement.getRightNode().getNumericValue();
        }
        return -1;
    }

    @Override
    public int[] getSortedTreeAsc() {
        int[] result = new int[getNumberOfElements()];
        currentElement = root;
        while (getLeftChild(currentElement.getNumericValue()) != -1 || getRightChild(currentElement.getNumericValue()) != -1) {
            if(getLeftChild(currentElement.getNumericValue()) != -1) {

            }
        }
        return result;
    }

    // Gets any immediate child branch's int value as an int array, if they exist
    public int[] getSortedTreeAscBranches(Node currentElement) {
        int leftChild = -9999;
        int rightChild = -9999;
        int count = 0;
        if (getLeftChild(currentElement.getNumericValue()) != -1) {
            leftChild = getLeftChild(currentElement.getNumericValue());
            count++;
        }
        if (getRightChild(currentElement.getNumericValue()) != -1) {
            rightChild = getRightChild(currentElement.getNumericValue());
            count++;
        }
        int[] result = new int[count];
        if (leftChild != -9999) {
            result[0] = leftChild;
        } else if (rightChild != -9999) {
            result[0] = rightChild;
        }
        if (count == 2) {
            result[1] = rightChild;
        }
        return result;
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }

    public Node getRoot() {
        return root;
    }
}
