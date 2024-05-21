package P12.Tugas_2_Praktikum;

public class dllFilm25 {
    nodeFilm25 head;
    int size;

    public dllFilm25() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(dataFilm25 input) {
        if (isEmpty()) {
            head = new nodeFilm25(null, input, null);
        } else {
            nodeFilm25 newNode = new nodeFilm25(null, input, head);
            head.prev = newNode;
            head = newNode;
        }
        size ++;
    }

    public void addLast(dataFilm25 input) {
        if (isEmpty()) {
            addFirst(input);
        } else {
            nodeFilm25 current = head;
            while (current.next != null) {
                current = current.next;
            }
            nodeFilm25 newNode = new nodeFilm25(current, input, null);
            current.next = newNode;
        }
        size ++;
    }
    public void add(dataFilm25 input, int index) throws Exception {
        if (isEmpty()) {
            addFirst(input);
        } else if (index < 0 || index > size){
            throw new Exception ("Nilai indeks di luar baras");
        } else {
            nodeFilm25 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;    
            }
            if (current.prev == null) {
                nodeFilm25 newNode = new nodeFilm25(null, input, current);
                current.prev = newNode;
                head = newNode;
            } else {
                nodeFilm25 newNode = new nodeFilm25(current.prev, input, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size ++;
    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, Tidak dapat di hapus");
        } else if (size == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size --;
    }
    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, Tidak dapat di hapus");
        } else if (size == 1) {
            head = null;
        } else {
            nodeFilm25 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size --;
    }
    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception ("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            nodeFilm25 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size --;
    }
    public void print() {
        if (!isEmpty()) {
            nodeFilm25 tmp = head;
            while (tmp != null) {
                System.out.println("ID : "+tmp.data.idFilm+" Judul Film : "+tmp.data.judul+" Tahun : "+tmp.data.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong\n");
        }
    }
    public void Cari(int key) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat melakukan pencarian");
        } else {
            nodeFilm25 current = head;
            boolean found = false;
            
            while (current != null) {
                if (current.data.idFilm == key) {
                    System.out.println("Data ditemukan: ID: " + current.data.idFilm + " Judul: " + current.data.judul + " Rating: " + current.data.rating);
                    found = true;
                    break;
                }
                current = current.next;
            }
            
            if (!found) {
                System.out.println("Data dengan ID " + key + " tidak ditemukan.");
            }
        }
    }
    public void sortDescendingByRating() {
        if (isEmpty() || size == 1) {
            return;
        }
    
        boolean tukar;
        do {
            tukar = false;
            nodeFilm25 current = head;
            while (current.next != null) {
                if (current.data.rating < current.next.data.rating) {
                    dataFilm25 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }
}
