public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {

    }

    public LinkedList(int val) {
        head = tail = new Node(val, null);
    }

    public void add(int val) { //Appended to tail
        tail.setNext(new Node(val, null));
        tail = tail.getNext();
    }

    public void add(int val, int pos) {
        if (pos == 0) {
            head = new Node(val, head);
            return;
        }
        Node temp = head;
        int ctr = 0;
        while (temp != null) {
            ctr++;
            if (ctr == pos) {
                temp.setNext(new Node(val, temp.getNext()));
                if (temp.getNext().getNext() == null) {
                    tail = temp.getNext();
                }
                return;
            }
            temp = temp.getNext();
        }
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
            ctr++;
            if (ctr == pos) {
                if (temp.getNext() == null) return; //If this is the last node
                temp.setNext(temp.getNext().getNext());//Skip over the node in between
                if (temp.getNext() == null) tail = temp;//If we removed the last node
                return;
            }
            temp = temp.getNext();
        }

    }

    public String toString() {
        String s = "";
        Node temp = head;
        while (temp != null) {
            s += temp.getVal();
            s += " ";
            temp = temp.getNext();
        }
        return s;
    }

    public void clear() {
        head = tail = null;
    }

    public Node getNode(int pos) {
        int ctr = 0;
        Node temp = head;
        while (temp != null) {
            if (ctr == pos) return temp;
            ctr++;
            temp = temp.getNext();
        }
        return null;
    }

    public int getVal(int pos) {
        Node result = getNode(pos);
        return result == null ? 0 : result.getVal();
    }
}
