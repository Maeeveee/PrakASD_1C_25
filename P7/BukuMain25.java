package P7;

import java.util.Scanner;

public class BukuMain25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        PencarianBuku25 PencarianMhs = new PencarianBuku25();
        int jumBuku = 5;

        System.out.println("======================================");
        System.out.println("Masukkan Data Buku Secara Urut Dari Kode Buku Terkecil : ");

        Buku25 m = new Buku25(111, "Algoritma", 2019, "Wahyuni", 5);
        Buku25 m1 = new Buku25(123, "Big Data", 2020, "Susilo", 3);
        Buku25 m2= new Buku25(125, "Desain UI", 2021, "Supriadi", 6);
        Buku25 m3 = new Buku25(126, "Web Programming", 2022, "Pustaka Adi", 2);
        Buku25 m4 = new Buku25(127, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);

        PencarianMhs.tambah(m);
        PencarianMhs.tambah(m1);
        PencarianMhs.tambah(m2);
        PencarianMhs.tambah(m3);
        PencarianMhs.tambah(m4);
        
        System.out.println("================================");
        System.out.println("Data Keseluruhan Buku : ");
        PencarianMhs.tampil();

        System.out.println("================================");
        System.out.println("Pencarian Buku : ");
        System.out.println("Masukkan Kode Buku : ");
        int cari = sc25.nextInt();

        System.out.println("Menggunakan Sequential Search");
        int posisi = PencarianMhs.findSeqSearch(cari);
        PencarianMhs.tampilposisi(cari, posisi);
        PencarianMhs.tampilData(cari, posisi);

        Buku25 dataBuku = PencarianMhs.findBuku(cari);

        if (dataBuku != null) {
            dataBuku.tampilDataBuku();
        }else {
            System.out.println("Buku tidak ditemukan");
        }

    }
}
