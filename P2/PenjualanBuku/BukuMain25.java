package P2.PenjualanBuku;

public class BukuMain25 {
    public static void main(String[] args) {
        Buku25 bk1 = new Buku25();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiharga(60000);
        bk1.tampilInformasi();

        Buku25 bk2 = new Buku25();
        bk2.judul = "How to train your dragon";
        bk2.pengarang = "Cressida cowell";
        bk2.halaman = 432;
        bk2.stok = 0;
        bk2.harga = 275_000;

        bk2.tampilInformasi();
        bk2.terjual(4);
        bk2.gantiharga(275000);
        bk2.tampilInformasi();
    }
}
