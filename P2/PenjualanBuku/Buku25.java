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
    }
    void restock(int jml){
        stok+=jml;
    }
    void gantiharga(int hrg){
        harga = hrg;
    }
    
}
