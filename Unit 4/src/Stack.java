public class Stack {
    private Node top;
    private int counter = 0;

    public Stack() {
    }

    public Stack(int val) {
        top = new Node(val);
        counter++;
    }

    public void push(int val) {
        top = new Node(val, top);
        counter++;
    }

    public void pop() {
        if (top != null) {
//            int val = top.getValue();
            top = top.getNext();
            counter--;
//            return val;
        } else {
            return;
//            return 0;
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder("Stack: ");
        Node temp = top;
        while (temp != null) {
            s.append(temp.getValue());
            s.append(" ");
            temp = temp.getNext();
        }
        return s.substring(0, s.length() - 1);
    }
}
