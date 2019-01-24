public class Main {
    public static void main(String[] args) {
        BT bt = new BT();
        bt.add(4);
        bt.add(1);

        bt.add(3);

        bt.add(5);

        bt.add(2);
        System.out.println(bt.average());
    }


    public static void printList(Node node) {
        if (node == null) return;
        System.out.println(node.getVal());
        printList(node.getNext());
    }
}
