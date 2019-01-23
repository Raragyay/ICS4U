public class DoubleNode {
    private String value;
    private DoubleNode next;
    private DoubleNode previous;

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }



    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode(String value, DoubleNode next, DoubleNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public DoubleNode(String value, DoubleNode next) {
        this.value = value;
        this.next = next;
    }

    public DoubleNode(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode(String value) {
        this.value = value;
    }

    public DoubleNode() {
    }
}
