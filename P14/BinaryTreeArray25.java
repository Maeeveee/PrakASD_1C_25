package P14;

public class BinaryTreeArray25 {
    int[] data;
    int idxLast;
    int size;

    public BinaryTreeArray25() {
        size = 10;
        data = new int[size];
        idxLast = -1;
    }
    public void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    public void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }
    public void add(int data) {
        if (idxLast+1 == size) {
          tambahSize();  
        }
        idxLast++;
        this.data[idxLast] = data;
    }
    public void tambahSize(){
        int updateSize = size*2;
        int[] newData = new int[updateSize];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
        size = updateSize;
    }
    public void traversePreOrder(){
        traversePreOrder(0);
    }
    public void traversePreOrder(int idxStart){
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart]+" ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }
    public void traversePostOrder(){
        traversePostOrder(0);
    }
    public void traversePostOrder(int idxStart){
        if (idxStart <= idxLast) {
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart]+" ");
        }
    }
}
