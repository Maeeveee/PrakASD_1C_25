package P7;

public class PencarianBuku25 {
    Buku25[] listBuku = new Buku25[5];
    int idx;

    public void tambah(Buku25 bk){
        if (idx< listBuku.length){
            listBuku[idx] = bk;
            idx ++;
        } else{
            System.out.println("Data Sudah Penuh");
        }
    }
    
    public void tampil(){
        for (Buku25 buku25 : listBuku) {
            buku25.tampilDataBuku();
        }
    }

    public int findSeqSearch(int cari){
        int posisi = -1;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void tampilposisi(int x, int pos){
        if (pos != -1) {
            System.out.println("data : "+x+" ditemukan pada indeks "+pos);
        } else{
            System.out.println("data "+x+" tidak ditemukan");
        }

    }

    public void tampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode Buku : "+x);
            System.out.println("Judul : "+listBuku[pos].judul);
            System.out.println("tahun Terbit : "+listBuku[pos].tahunTerbit);
            System.out.println("Pengarang : "+listBuku[pos].pengarang);
            System.out.println("Stock : "+listBuku[pos].stock);
        }else{
            System.out.println("data "+x+" tidak ditemukan");
        }
    }
}
