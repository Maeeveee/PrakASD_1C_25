package P2.PenjualanBuku;

public class Buku25 {
    String judul, pengarang;
    int halaman, stok, harga = 0;

    void tampilInformasi(){
        System.out.println("==================================");
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
    int hitungHargaTotal(int jml){
        return harga*jml;
    }
    double hitungDiskon(int jml){
        double diskon = hitungHargaTotal(jml);
        double HargaFinal = 0;
        if (diskon>150_000) {
            HargaFinal = diskon*0.12;
        }else if(diskon>=75_000&&diskon<=150_000){
            HargaFinal = diskon*0.05;
        }else if (diskon>=0&&diskon<75_000) {
            HargaFinal = diskon;
        }
        return HargaFinal;
    }
}
