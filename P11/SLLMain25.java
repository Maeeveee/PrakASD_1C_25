package P11;

public class SLLMain25 {
    public static void main(String[] args) {
        SingleLinkedList25 singLL = new SingleLinkedList25();

        singLL.print();
        singLL.addFrist(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFrist(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
}
