package P7;

public class Buku25 {
    String kodeBuku;
    String judul;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku25(String kodeBuku, String judul, int tahunTerbit, String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku(){
        System.out.println("===============================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stock : " + stock);
    }
}
