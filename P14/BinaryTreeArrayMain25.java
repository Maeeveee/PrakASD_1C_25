package P14;

public class BinaryTreeArrayMain25 {
    public static void main(String[] args) {
        BinaryTreeArray25 bta = new BinaryTreeArray25();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
    }       
}
