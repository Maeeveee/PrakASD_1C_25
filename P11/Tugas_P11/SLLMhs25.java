package P11.Tugas_P11;

import P11.node25;

public class SLLMhs25 {
    nodeTugas25 head,tail;
    datamhs25 data = new datamhs25();
    public boolean isEmpty() {
        return head == null;
    }
    
    public void print() {
        if (!isEmpty()) {
             if (!isEmpty()) {
            nodeTugas25 tmp = head;
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
    }
    public void addFrist(datamhs25 data) {
        nodeTugas25 ndInput = new nodeTugas25(data, null);
        if (isEmpty()) {
            head = tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }
    public void addLast(datamhs25 data) {
        nodeTugas25 ndInput = new nodeTugas25(data, null);
        if (isEmpty()) {
            head = tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }
    public void insertAfter(datamhs25 key, datamhs25 data) {
        nodeTugas25 ndInput = new nodeTugas25(data, null);
        nodeTugas25 temp = head;
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
    public void insertAt(int index, datamhs25 data) {
        nodeTugas25 ndInput = new nodeTugas25(data, null);
        if (index<0) {
            System.out.println("indeks tidak valid");
        }else if(index == 0){
                addFrist(data);
        }else{
            nodeTugas25 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new nodeTugas25(data, temp.next);
            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }
}
