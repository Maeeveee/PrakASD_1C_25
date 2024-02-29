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

        Buku25 bk2 = new Buku25("Self Reward","maheera ayesha",160,29,59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
}
