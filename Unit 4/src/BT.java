public class BT {
    private BTNode root;

    public BT() {
    }

    public BT(int v) {
        root = new BTNode(v);
    }

    public void add(int v) {
        if (root == null) root = new BTNode(v);
        else addRecursion(root, v);
    }

    private void addRecursion(BTNode node, int v) {
        int nv = node.getValue();
        if (v < nv) {
            if (node.getLeft() == null) node.setLeft(new BTNode(v));
            else addRecursion(node.getLeft(), v);
        } else {
            if (node.getRight() == null) node.setRight(new BTNode(v));
            else addRecursion(node.getRight(), v);
        }
    }

    public String toString() {
        return "Binary Tree: " + toStringRecursion(root);
    }

    private String toStringRecursion(BTNode node) {
        if (node == null) return "";
        else return toStringRecursion(node.getLeft()) + node.getValue() + " " + toStringRecursion(node.getRight());
    }



}
