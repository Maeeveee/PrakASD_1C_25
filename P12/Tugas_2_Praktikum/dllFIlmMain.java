package P12.Tugas_2_Praktikum;
import java.util.Scanner;

public class dllFIlmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        dllFilm25 dll = new dllFilm25();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data pada index tertentu");
            System.out.println("4. Hapus data awal");
            System.out.println("5. Hapus data akhir");
            System.out.println("6. Hapus data pada index tertentu");
            System.out.println("7. Cetak data");
            System.out.println("8. Cari berdasarkan ID Film");
            System.out.println("9. Urut data berdasarkan rating secara descending");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID Film: ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Judul Film: ");
                    String judul1 = scanner.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double rating1 = scanner.nextDouble();
                    scanner.nextLine();
                    dll.addFirst(new dataFilm25(id1, judul1, rating1));
                    System.out.println("Data berhasil ditambahkan di awal");
                    break;
                case 2:
                    System.out.print("Masukkan ID Film: ");
                    int id2 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Judul Film: ");
                    String judul2 = scanner.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double rating2 = scanner.nextDouble();
                    scanner.nextLine();
                    dll.addLast(new dataFilm25(id2, judul2, rating2));
                    System.out.println("Data berhasil ditambahkan di akhir");
                    break;
                case 3:
                    System.out.print("Masukkan ID Film: ");
                    int id3 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan Judul Film: ");
                    String judul3 = scanner.nextLine();
                    System.out.print("Masukkan Rating Film: ");
                    double rating3 = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan index untuk menyisipkan data: ");
                    int index3 = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        dll.add(new dataFilm25(id3, judul3, rating3), index3);
                        System.out.println("Data berhasil ditambahkan pada index " + index3);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        dll.removeFirst();
                        System.out.println("Data pertama berhasil dihapus");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        dll.removeLast();
                        System.out.println("Data terakhir berhasil dihapus");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Masukkan index untuk menghapus data: ");
                    int index6 = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        dll.remove(index6);
                        System.out.println("Data pada index " + index6 + " berhasil dihapus");
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Data Film:");
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    int idToFind = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        dll.Cari(idToFind);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 9:
                    dll.sortDescendingByRating();
                    System.out.println("Data berhasil diurutkan berdasarkan rating secara descending");
                    break;
                case 10:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }

        scanner.close();
    }
}
