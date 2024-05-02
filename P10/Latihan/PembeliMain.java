package P10.Latihan;

import java.util.Scanner;

import UTS.StackTransaksi25;

public class PembeliMain {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        System.out.print("Masukkan panjang stack : ");
        int panjang = sc25.nextInt();
        sc25.nextLine();
        QueuePembeli25 pembeli = new QueuePembeli25(panjang);

        do {
            System.out.println("\t\t\t\tMenu");
            System.out.println("1. Antrian Baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Cek antrian terdepan");
            System.out.println("4. Cek antrian terbelakang");
            System.out.println("5. Cek semua antrian");
            System.out.println("6. Cari Antrian (Nama)");
            System.out.println("7. Exit");
            int pilihan = sc25.nextInt();
            sc25.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama : ");
                    String nama = sc25.nextLine();
                    System.out.print("Masukkan NoHP : ");
                    int NoHP = sc25.nextInt();
                    sc25.nextLine();
                    Pembeli25 AddData = new Pembeli25(nama, NoHP);
                    pembeli.enqueue(AddData);
                    break;
                case 2:
                    Pembeli25 data = pembeli.dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    pembeli.peek();
                    break;
                case 4:
                    pembeli.peekRear();
                    break;
                case 5:
                    pembeli.print();
                    break;
                case 6:
                    System.out.println("Masukkan nama yang ingin dicari : ");
                    String cariNama = sc25.nextLine();
                    pembeli.Search(cariNama);
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (true);
    }
}
