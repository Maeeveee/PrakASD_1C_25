package P14;

public class BinaryTreeMain25 {
    public static void main(String[] args) {
    BinaryTree25 bt = new BinaryTree25();
    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);
    bt.add(10);
    bt.add(15);
    System.out.print("PreOrder Traversal:");
    bt.traversePreOrder(bt.root);
    System.out.println("");
    System.out.print("inOrder Traversal:");
    bt.traverseInOrder(bt.root);
    System.out.println("");
    System.out.print("PostOrder Traversal:");
    bt.traversePostOrder(bt.root);
    System.out.println("");
    System.out.println("Find Node : "+bt.find(5));
    System.out.println("delete Node 8");
    bt.delete(8);
    System.out.println("");
    System.out.print("preOrder Traversal:");
    bt.traversePreOrder(bt.root);
    System.out.println(""); 

    //Latihan praktikum nomor 1
    System.out.println("Menambahkan data secara rekursif : (14,2,20,1)");
    int[] dataRecursive = {14,2,20,1};
    for (int value : dataRecursive) {
        bt.addRecursive(value);
    }
    System.out.print("inOrder Traversal:");
    bt.traverseInOrder(bt.root);

    //Latihan praktikum nomor 2
    int dataMax = bt.findMaxValue();
    int dataMin = bt.findMinValue();
    System.out.println("\nNilai Max : "+dataMax);
    System.out.println("Nilai Min : "+dataMin);

    //Latihan praktikum nomor 3
    bt.displayLeafNodes();

    //Latihan praktikum nomor 4
    int leafCount = bt.countLeafNodes();
    System.out.println("\nJumlah leaf nodes : "+leafCount);
    }

}
