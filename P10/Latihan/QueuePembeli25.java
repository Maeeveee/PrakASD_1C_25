package P10.Latihan;

public class QueuePembeli25 {
    Pembeli25 data[];
    int front;
    int rear;
    int size;
    int max;

    public QueuePembeli25(int n){
        max =  n;
        data = new Pembeli25[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty(){
        if (size == 0 ) {
            return true;
        }else {
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if(!isEmpty()){
            System.out.println("elemen Terdepan: "+data[front].nama+" "+data[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if(!isEmpty()){
            System.out.println("elemen Terdepan: "+data[rear].nama+" "+data[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i].nama+" "+data[i].noHP+" ");
                i = (i + 1) % max;
            }
            System.out.println(data[i].nama+" "+data[i].noHP);
            System.out.println("jumlah elemen = "+size);
        }
    }
    public void clear(){
        if (isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("queue berhasil dikosongkan");
        }else {
            System.out.println("Queue masih kosong");
        }
    }
    public void enqueue(Pembeli25 dt){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        }else{
            if (isEmpty()) {
                front = rear =0;
            }else{
                if (rear == max -1) {
                    rear = 0;
                }else{
                    rear++;
                }
            }
            data[rear] = dt;
            size ++;
        }
    }
    public Pembeli25 dequeue(){
        Pembeli25 dt = new Pembeli25();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        }else {
            dt = data[front];
            size--;
        if (isEmpty()) {
            front = rear = -1;
        }else{
            if (front == max -1) {
                front = 0;
            }else{
                front++;
            }
        }
        }
        return dt;
    }
    public void Search(String nama){
        for (int i = 0; i < data.length; i++) {
            if (data[i].nama.equalsIgnoreCase(nama)) {
                System.out.println("Data ditemukan!");
                System.out.println("Nama "+data[i].nama+" NoHP "+data[i].noHP);
                break;
            }

        }
            
        
    }
}
