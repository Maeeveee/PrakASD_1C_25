package P12.Tugas_Praktikum1;

public class dllVaksin25 {
    nodeVaksin25 head;
    int size;

    public dllVaksin25() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
            return head == null;
    }

    public void addLast(dataVaksin25 input) {
        if (isEmpty()) {
            head = new nodeVaksin25(null, input, null);
        } else {
            nodeVaksin25 current = head;
            while (current.next != null) {
                current = current.next;
            }
            nodeVaksin25 newNode = new nodeVaksin25(current, input, null);
            current.next = newNode;
        }
        size++;
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, Tidak dapat di hapus");
        } else if (size == 1) {
            System.out.println(head.data.nama+" selesai di vaksinasi");
            head = null;
            size--;
        } else {
            System.out.println(head.data.nama+" selesai di vaksinasi");
            head = head.next;
            size--;
        }
    }
    public void print() {
        if (!isEmpty()) {
            nodeVaksin25 tmp = head;
            while (tmp != null) {
                System.out.print("nama: " + tmp.data.nama + "\tnomor: " + tmp.data.no + "\n");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong\n");
        }
    }
    public int size(){
        return size;
    }
}
