public class Node {
    private Node next;
    private int val;

    public Node(int v, Node n) {
        val = v;
        next = n;
    }

    public int getVal() {
        return val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String printChain() {
        StringBuilder s = new StringBuilder();
        Node temp = this;
        while (temp != null) {
            s.append(temp.getVal());
            temp = temp.getNext();
        }
        return s.toString();
    }
}
