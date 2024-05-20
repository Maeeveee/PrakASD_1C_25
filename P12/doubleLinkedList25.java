package P12;

public class doubleLinkedList25 {
    node25 head;
    int size;

    public doubleLinkedList25() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int input) {
        if (isEmpty()) {
            head = new node25(null, input, null);
        } else {
            node25 newNode = new node25(null, input, head);
            head.prev = newNode;
            head = newNode;
        }
        size ++;
    }

    public void addLast(int input) {
        if (isEmpty()) {
            addFirst(input);
        } else {
            node25 currrent = head;
            while (currrent.next != null) {
                currrent = currrent.next;
            }
            node25 newNode = new node25(currrent, input, null);
            currrent.next = newNode;
            size ++;
        }
    }
    public void add(int input, int index) throws Exception {
        if (isEmpty()) {
            addFirst(input);
        } else if (index < 0 || index > size){
            throw new Exception ("Nilai indeks di luar baras");
        } else {
            node25 current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                node25 newNode = new node25(null, input, current);
                current.prev = newNode;
                head = newNode;
            } else {
                node25 newNode = new node25(current.prev, input, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size ++;
    }
    public int size(){
        return size;
    }
    public void clear() {
        head = null;
        size = 0;
    }
    public void print(){
        if (!isEmpty()) {
            node25 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked List Kosong\n");
        }
    }
}
