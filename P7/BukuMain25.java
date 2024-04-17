package P7;

import java.util.Scanner;

public class BukuMain25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        PencarianBuku25 PencarianMhs = new PencarianBuku25();
        int jumBuku = 5;

        System.out.println("======================================");
        System.out.println("Masukkan Data Buku Secara Urut Dari Kode Buku Terkecil : ");

        Buku25 m = new Buku25("20215", "Algoritma", 2019, "Wahyuni", 5);
        Buku25 m1 = new Buku25("20214", "Big Data", 2020, "Susilo", 3);
        Buku25 m2 = new Buku25("20212", "Desain UI", 2021, "Supriadi", 6);
        Buku25 m3 = new Buku25("20211", "Web Programming", 2022, "Pustaka Adi", 2);
        Buku25 m4 = new Buku25("20210", "Etika Mahasiswa", 2023, "Darmawan Adi", 1);

        PencarianMhs.tambah(m);
        PencarianMhs.tambah(m1);
        PencarianMhs.tambah(m2);
        PencarianMhs.tambah(m3);
        PencarianMhs.tambah(m4);

        PencarianMhs.sortBukuByJudul();
        
        System.out.println("================================");
        System.out.println("Data Keseluruhan Buku : ");
        PencarianMhs.tampil();

        System.out.println("================================");
        System.out.println("Pencarian Buku: ");
        System.out.println("1. Pencarian berdasarkan Kode Buku");
        System.out.println("2. Pencarian berdasarkan Judul Buku");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = sc25.nextInt();
        sc25.nextLine();
        
        PencarianMhs.sortBukuByKode();
        switch (pilihan) {
            case 1:
                System.out.println("\nPencarian berdasarkan kode buku");
                System.out.print("Masukkan Kode Buku : ");
                String cari = sc25.next();

                System.out.println("\nMenggunakan Sequential Search");
                int posisi = PencarianMhs.findSeqSearch(cari);
                PencarianMhs.tampilposisi(cari, posisi);
                PencarianMhs.tampilData(cari, posisi);

                Buku25 dataBuku = PencarianMhs.findBuku(cari);

                if (dataBuku != null) {
                    dataBuku.tampilDataBuku();
                } else {
                    System.out.println("Buku tidak ditemukan");
                }

                System.out.println("================================");
                System.out.println("Menggunakan Binary Search");
                posisi = PencarianMhs.findBinarySearch(cari, 0, jumBuku - 1);
                PencarianMhs.tampilposisi(cari, posisi);
                PencarianMhs.tampilData(cari, posisi);

                break;

            case 2:
                System.out.println("================================");
                System.out.println("Pencarian Buku berdasarkan Judul Buku: ");
                System.out.println("Masukkan Judul Buku: ");
                String cariJudul = sc25.nextLine();

                System.out.println("Menggunakan Sequential Search");
                int posSequentialJudul = PencarianMhs.findSeqSearchByJudul(cariJudul);
                PencarianMhs.tampilposisi(cariJudul, posSequentialJudul);
                PencarianMhs.tampilData(cariJudul, posSequentialJudul);

                System.out.println("================================");
                System.out.println("Menggunakan Binary Search");
                int posBinaryJudul = PencarianMhs.findBinarySearchByJudul(cariJudul, 0, jumBuku - 1);
                PencarianMhs.tampilposisi(cariJudul, posBinaryJudul);
                PencarianMhs.tampilData(cariJudul, posBinaryJudul);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

    }
}
