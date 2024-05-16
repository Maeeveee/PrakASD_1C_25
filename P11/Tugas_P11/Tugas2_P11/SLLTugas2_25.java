package P11.Tugas_P11.Tugas2_P11;

public class SLLTugas2_25 {
    nodeTugas2_25 head,tail;
    dataMhsT2_25 data = new dataMhsT2_25();

    public boolean isEmpty() {
        return head == null;
    }
    public void print() {
             if (!isEmpty()) {
            nodeTugas2_25 tmp = head;
            System.out.println("Isi Linked List : ");
            while (tmp != null) {
                System.out.println("nama : "+tmp.data.nama+" nim : "+tmp.data.nim);
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong\n");
        }
        
    }
    public void addLast(dataMhsT2_25 data) {
        nodeTugas2_25 ndInput = new nodeTugas2_25(data, null);
        if (isEmpty()) {
            head = tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            }else{
                head = head.next;
            }
        }
    }
}
