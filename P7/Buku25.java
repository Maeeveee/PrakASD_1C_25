package P7;

public class Buku25 {
    int kodeBuku;
    String judul;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku25(int kodeBuku, String judul, int tahunTerbit,String pengarang, int stock){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku(){
        System.out.println("===============================");
        System.out.println("Kode Buku : "+kodeBuku);
        System.out.println("judul buku : "+judul);
        System.out.println("tahun terbit : "+tahunTerbit);
        System.out.println("pengarang : "+pengarang);
        System.out.println("Stock : "+stock);
    }
}
