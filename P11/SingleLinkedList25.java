package P11;

public class SingleLinkedList25 {
    node25 head, tail;

    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
        if (!isEmpty()) {
            node25 tmp = head;
            System.out.print("Isi Linked List : ");
            while (tmp != null) {
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong\n");
        }
    }
    public void addFrist(int input){
        node25 ndInput = new node25(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(int input){
        node25 ndInput = new node25(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(int key, int input){
        node25 ndInput = new node25(input, null);
        node25 temp = head;
        do{
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }
    public void insertAt(int index, int input){
        node25 ndInput = new node25(input, null);
        if (index < 0) {
            System.out.println("perbaiki logikanya!"+"kalau indeksnya -1 bagaimana");
        } else if (index == 0) {
            addFrist(input);
        }else{
            node25 temp = head;
            for (int i = 0; i < index-1; i++) {
             temp = temp.next;   
            }

            temp.next = new node25(input, temp.next);
            if (temp.next == null) {
                tail = temp.next;
            }
        }
    }
    public int getData(int index){
        node25 tmp = head;
        for (int i = 0; i < index-1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }
    public int indexOf(int key){
        node25 tmp = head;
        int index = 0;
        while (tmp != null&&tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return -1;
        }else{
            return index;
        }
    }
    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong data tidak dapat dihapus");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong data tidak dapat dihapus");
        }else if (head == tail) {
            head = tail = null;
        }else{
            node25 tmp = head;
            while (tmp.next != tail) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tmp;
        }
    }
    public void remove(int key){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong data tidak dapat dihapus");   
        }else{
            node25 temp = head;
            while(temp != null){
                if (temp.data == key && temp == head) {
                    removeFirst();
                    break;
                }else if (temp.next.data == key) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }
    public void removeAt(int index){
        if (index == 0 ) {
            removeFirst();
        }else{
            node25 temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }

}
