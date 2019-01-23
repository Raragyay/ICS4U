public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(int value) {
        head = new Node(value);
        tail = head;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        tail.setNext(newNode);
        tail = newNode;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            s.append(temp.getValue());
            s.append(' ');
            temp = temp.getNext();
        }
        return s.toString();
    }

    public void remove(int pos) {
        if (head == null) {
            return;
        }
        if (pos == 0) {
            head = head.getNext();
            return;
        }
        int ctr = 0;
        Node temp = head;
        while (temp != null) {
            ctr += 1;
            if (ctr == pos) {
                if (temp.getNext() == null) return;
                temp.setNext(temp.getNext().getNext());
                if (temp.getNext() == null) tail = temp;
                return;
            }
            temp = temp.getNext();
        }
    }

    public void add(int val, int pos) {//TODO ask chow if pos past end of linked list should be inserted
        if (pos == 0) {
            head = new Node(val, head);
        }
        int ctr = 0;
        Node temp = head;
        Node insert = new Node(val);
        while (temp != null) {
            ctr++;
            if (ctr == pos) {
                insert.setNext(temp.getNext());
                temp.setNext(insert);
                if (insert.getNext() == null) {
                    tail = insert;
                }
            }
            temp = temp.getNext();
        }
    }

    public void clear() {
        head = tail = null;
    }

    public int getVal(int pos) {
        int ctr = 0;
        Node temp = head;
        while (temp != null) {
            if (ctr == pos) return temp.getValue();
            ctr++;
            temp = temp.getNext();
        }
        throw new IndexOutOfBoundsException();
    }

    public Node getNode(int pos) {
        int ctr = 0;
        Node temp = head;
        while (temp != null) {
            if (ctr == pos) return temp;
            ctr++;
            temp = temp.getNext();
        }
        throw new IndexOutOfBoundsException();
    }

}
