public class BT {
    private BTNode root;

    public BT() {

    }

    public BT(int val) {
        root = new BTNode(val);
    }

    public void add(int val) {
        if (root == null) {
            root = new BTNode(val);
        } else {
            addRecursion(val, root);
        }
    }

    public void addRecursion(int val, BTNode node) {
        if (val < node.getValue()) {
            if (node.getLeft() == null) {
                node.setLeft(new BTNode(val));
            } else {
                addRecursion(val, node.getLeft());
            }
        } else {
            if (node.getRight() == null) {
                node.setRight(new BTNode(val));
            } else {
                addRecursion(val, node.getRight());
            }

        }
    }

    public String toString() {
        return "Binary Tree: " + toStringRecursion(root);
    }

    public String toStringRecursion(BTNode node) {
        if (node == null) return "";
        String s = "";
        s += toStringRecursion(node.getLeft());
        s += node.getValue() + " ";
        s += toStringRecursion(node.getRight());
        return s;
    }

    public void clear() {
        root = null;
    }

    public double average() {
        return (double) sum(root) / count(root);
    }

    public int count(BTNode node) {
        if (node == null) return 0;
        int count = 1;
        count += count(node.getLeft());
        count += count(node.getRight());
        return count;
    }

    public int sum(BTNode node) {
        if (node == null) return 0;
        int sum = node.getValue();
        sum += sum(node.getLeft());
        sum += sum(node.getRight());
        return sum;
    }
}
