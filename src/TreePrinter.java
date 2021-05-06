public class TreePrinter {

    void print(Node node) {
        while(node != null) {
            System.out.println(node.getElem());
            node = node.getNode();
        }
    }

    void printRecursively(Node node) {
        if(node == null) {
            return;
        } else {
            System.out.println(node.getElem());
            printRecursively(node.getNode());
        }
    }
}
