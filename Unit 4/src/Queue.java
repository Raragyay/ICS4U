public class Queue {
    private Node head = null;
    private Node tail = null;
    private int ctr = 0;

    public Queue() {
    }

    public Queue(int i) {
        head = tail = new Node(i);
        ctr++;
    }

    public void queue(int i) {
        tail = new Node(i, tail);
        if (ctr++ == 0) head = tail;
    }

    public void dequeue() {
        if (--ctr <= 0) {
            ctr = 0;
            head = tail = null;
            return;
        }
        Node temp = tail;
        while (temp.getNext() != head) temp = temp.getNext();
        temp.setNext(null);
        head = temp;

    }

    public String toString() {
        StringBuilder s = new StringBuilder("Queue: ");
        Node temp = tail;
        while (temp != null) {
            s.append(temp.getValue());
            s.append(" ");
            temp = temp.getNext();
        }
        return s.substring(0, s.length() - 1);
    }
}
