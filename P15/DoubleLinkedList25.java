package P15;

public class DoubleLinkedList25 {
    Node25 head;
    int size;

    public DoubleLinkedList25() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node25(null, item, jarak, null);
        }else{
            Node25 newNode = new Node25(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public int size(){
        return size;
    }
    public int get(int index)throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node25 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int getJarak(int index)throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node25 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void remove(int index){
        Node25 current = head;
            while (current != null) {
                if (current.data == index) {
                    if (current.prev != null) {
                        current.prev.next = current.next;
                    }else{
                        head = current.next;
                    }
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                    break;
                }
                current = current.next;
            }
            size--;
    }
    public void clear() {
        head = null;
        size = 0;
    }
    public void updateWeight(int index, int weight) throws Exception {
        if (index < 0 || index >= size) {
            throw new Exception("Index out of bounds");
        }
        Node25 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.jarak = weight;
    }
}
