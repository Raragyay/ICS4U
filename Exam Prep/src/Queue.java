public class Queue {
    //tail-->node-->head
    private Node head;//Head is the "end" of the node chain, any appends are from
    private Node tail;
    private int length = 0;

    public Queue() {
    }

    public Queue(int val) {
        head = tail = new Node(val, null);
        length++;
    }

    public void queue(int val) {// Insert new node at the "back" of the queue, pointing to the tail
        if (length == 0) {
            head = tail = new Node(val, null);
        } else {
            tail = new Node(val, tail);
        }
        length++;
    }

    public void dequeue() {
        if (length == 0) {
            return;
        }
        if (length == 1) {
            length = 0;
            head = tail = null;
            return;
        }
        Node temp = tail;
        for (int i = 1; i < length - 1; i++) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        head = temp;
        length -= 1;
    }


    public String toString() {
        String s = "Queue: ";
        Node temp = tail;
        while (temp != null) {
            s += temp.getVal() + " ";
            temp = temp.getNext();
        }
        return s;
    }

    public void clear() {
        head = tail = null;
        length = 0;
    }

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public static Queue directMerge(Queue q1, Queue q2) {
        Queue q = new Queue();
        while (q1.getLength() > 0) {
            q.queue(q1.getHead().getVal());
            q1.dequeue();
        }
        while (q2.getLength() > 0) {
            q.queue(q2.getHead().getVal());
            q2.dequeue();
        }
        return q;
    }

    public static Queue alternateMerge(Queue q1, Queue q2) {
        Queue q = new Queue();
        while (q1.getLength() != 0 || q2.getLength() != 0) {
            if (q1.getLength() > 0) {
                q.queue(q1.getHead().getVal());
                q1.dequeue();
            }
            if (q2.getLength() > 0) {
                q.queue(q2.getHead().getVal());
                q2.dequeue();
            }
        }
        return q;
    }
}
