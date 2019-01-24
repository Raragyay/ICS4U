public class DoubleNode {
    private DoubleNode next;
    private DoubleNode previous;
    private int val;

    public DoubleNode(int v, DoubleNode n, DoubleNode previous) {
        val = v;
        next = n;
        this.previous = previous;
    }

    public int getVal() {
        return val;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public String printChain() {
        StringBuilder s = new StringBuilder();
        DoubleNode temp = this;
        while (temp != null) {
            s.append(temp.getVal());
            temp = temp.getNext();
        }
        return s.toString();
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }
}
