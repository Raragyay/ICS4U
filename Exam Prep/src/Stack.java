public class Stack {
    private Node top;//DONT FORGET THIS YOU IDIOT
    private int length = 0;

    public Stack() {

    }

    public Stack(int val) {
        push(val);
    }

    public void push(int val) {
        top = new Node(val, top);
        length++;
    }

    public void pop() {
        if (length != 0) {
            top = top.getNext();
            length--;
        }
    }

    public String toString() {
        String s = "Stack: ";
        Node temp = top;
        while (temp != null) {
            s += temp.getVal() + " ";
            temp = temp.getNext();
        }
        return s;
    }

    public void clear() {
        top = null;
        length = 0;
    }

    public double average() {
        double sum = 0;
        Node temp = top;
        while (temp != null) {
            sum += temp.getVal();
            temp = temp.getNext();
        }
        return sum / length;
    }

    public int peek() {
        return top.getVal();
    }
}
