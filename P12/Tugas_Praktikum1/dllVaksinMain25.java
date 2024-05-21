package P12.Tugas_Praktikum1;

import java.util.Scanner;

public class dllVaksinMain25 {
    public static void main(String[] args) throws Exception {
        Scanner sc25 = new Scanner(System.in);
        dllVaksin25 dll = new dllVaksin25();

        int pilihan;
        do {
            System.out.println("\n+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah data Penerima Vaksin");
            System.out.println("2. hapus data Penerima Vaksin");
            System.out.println("3. daftar penerima vaksin");
            System.out.println("4. keluar");
            System.out.print("----->");
            pilihan = sc25.nextInt();
            sc25.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nomor Penerima Vaksin : ");
                int no = sc25.nextInt();
                sc25.nextLine();
                System.out.print("Masukkan nama Penerima Vaksin : ");
                String nama = sc25.nextLine();
                dataVaksin25 data = new dataVaksin25(no, nama);
                dll.addLast(data);
                System.out.println("Data " + nama + " Vaksin Berhasil ditambahkan");
                dll.print();
            } else if (pilihan == 2) {
                dll.removeFirst();
            } else if (pilihan == 3) {
                dll.print();
                System.out.println("jumlah antrian vaksin : " + dll.size());
            }

        } while (pilihan > 0 && pilihan < 4);
    }
}
