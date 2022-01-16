import kotlinversion.Node;

public class Main {
    public static void main(String[] args) {
        // Example
        Node node = new Node(4);
        node.appendToEnd(5);
        node.appendToEnd(6);
        node.appendToEnd(7);
        // End of Example

        node.printNodes();

        System.out.print("Length of the Nodes: " + node.length(node) + "\n");

        System.out.print("Sum of the Nodes: " + node.sumOfNodes() + "\n");

        node.deleteNode(node , 5);

        node.printNodes();

    }
}
