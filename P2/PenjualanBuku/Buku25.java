package P2.PenjualanBuku;

public class Buku25 {
    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi(){
        System.out.println("Judul : "+ judul);
        System.out.println("Pengarang : "+ pengarang);
        System.out.println("Halaman : "+ halaman);
        System.out.println("Stok : "+ stok);
        System.out.println("Harga : "+ harga);
    }
    void terjual(int jml){
     stok -= jml;
    if (stok>0) {
       System.out.println(stok);
    }else{
        stok = 0;
    }

    }
    void restock(int jml){
        stok+=jml;
    }
    void gantiharga(int hrg){
        harga = hrg;
    }
    public Buku25(){

    }
    public Buku25(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
