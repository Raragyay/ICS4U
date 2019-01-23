public class Main {
    public static void main(String[] args) {

        
        BT bt=new BT();
        System.out.println(bt);
        bt.add(10);
        System.out.println(bt);
        bt.add(8);
        System.out.println(bt);
        bt.add(47);
        System.out.println(bt);
        bt.add(1);
        System.out.println(bt);
        bt.add(3);
        System.out.println(bt);
        bt.add(42);
        System.out.println(bt);
        bt.add(9);
        System.out.println(bt);
        bt.add(12);
        System.out.println(bt);
        bt.add(6);
        System.out.println(bt);
        bt.add(13);
        System.out.println(bt);
    }

    public static void printList(Node node) {
        if (node == null) return;
        System.out.println(node.getValue());
        printList(node.getNext());

    }
}
