package P10.Praktikum1;

import java.util.Scanner;

public class QueueMain25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas Queue : ");
        int n = sc25.nextInt();

        Queue25 Q = new Queue25(n);
        int pilih;
        do {
            menu();
            pilih = sc25.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data baru : ");
                    int dataMasuk = sc25.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar =  Q.dequeue();
                    if (dataKeluar != 0 ) {
                        System.out.println("Data yang dikeluarkan : "+ dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1||pilih==2||pilih==3||pilih==4||pilih==5);
    }

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. clear");
    }
}
