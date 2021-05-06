public class Node {
    private int elem;
    private Node node;

    public Node(int elem) {
        this.elem = elem;
        this.node = null;
    }

    public Node(int elem, Node node) {
        this.elem = elem;
        this.node = node;
    }

    public int getElem() {
        return elem;
    }

    public Node getNode() {
        return node;
    }
}
