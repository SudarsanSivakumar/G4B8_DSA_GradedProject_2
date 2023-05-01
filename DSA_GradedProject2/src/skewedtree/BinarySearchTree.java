package skewedtree;

class Node {
    int val;
    Node left, right;

    Node(int item) {
        val = item;
        left = right = null;
    }
}

public class BinarySearchTree {

	public Node node;
    Node prevNode = null;
    Node headNode = null;

    void BSToSkewed(Node root) {
        // Base Case
        if (root == null) {
            return;
        }

        BSToSkewed(root.left);

        Node rightNode = root.right;

        if (headNode == null) {
            headNode = root;
            root.left = null;
            prevNode = root;
        } else {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }

        BSToSkewed(rightNode);
    }

    void traverseRightSkewed(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);
    }
}
