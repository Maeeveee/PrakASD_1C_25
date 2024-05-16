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
            head = ndInput;
            tail = ndInput;
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
                    break;
                }
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
    
}
