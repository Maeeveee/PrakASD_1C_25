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
    public void removeFirst()throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked list masih kosong, Tidak dapat di hapus");
        }else if (size == 1) {
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size --;
        }
    }
    public void removeLast()throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked list masih kosong, Tidak dapat di hapus");
        }else if (head.next == null){
            head = null;
            size --;
            return;
        }
        node25 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size --;
    }
    public void remove(int index)throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception ("Nilai indeks di luar batas");
        } else if (index == 0){
            removeFirst();
        } else{
            node25 current = head;
            int i = 0;
            while (i<index){
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size --;
        }
    }
    public int getFirst()throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked list masih kosong");
        }
        return head.data;
    }
    public int getLast()throws Exception{
        if (isEmpty()) {
            throw new Exception ("Linked list masih kosong");
        }
        node25 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public int get(int index)throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        node25 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
