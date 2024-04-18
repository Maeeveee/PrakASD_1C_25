package P8;

import java.util.Scanner;

public class Utama25 {
    public static void main(String[] args) {
        Scanner scanner25 = new Scanner(System.in);

        System.out.print("Masukkan jumlah kapasitas gudang : ");
        int kapasitasGudang = scanner25.nextInt();
        scanner25.nextLine();
        Gudang25 gudang = new Gudang25(kapasitasGudang);

        while (true) {
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Lihat barang terbawah");
            System.out.println("6. Cari Barang (kode)");
            System.out.println("7. Keluar");
            System.out.print("Pilih Menu : ");
            int pilihan = scanner25.nextInt();
            scanner25.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang : ");
                    int kode = scanner25.nextInt();
                    scanner25.nextLine();
                    System.out.print("Masukkan nama barang : ");
                    String nama = scanner25.nextLine();
                    System.out.print("masukkan nama kategori : ");
                    String Kategori = scanner25.nextLine();
                    Barang25 barangBaru = new Barang25(kode, nama, Kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("Masukkan kode barang yang ingin dicari : ");
                    int cari = scanner25.nextInt();
                    scanner25.nextLine();
                    int posisi = gudang.findSeqSearch(cari);
                    if (posisi != -1) {
                        System.out.println("Barang dengan kode " + cari + " ditemukan pada posisi " + posisi);
                    } else {
                        System.out.println("Barang dengan kode " + cari + " tidak ditemukan dalam gudang.");
                    }
                    break;
                case 7:
                System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. silahkan coba lagi");
                    break;
            }
        }

    }
}
