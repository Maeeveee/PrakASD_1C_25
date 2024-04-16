package P7;

public class PencarianBuku25 {
    Buku25[] listBuku = new Buku25[5];
    int idx;

    public void tambah(Buku25 bk){
        if (idx < listBuku.length){
            listBuku[idx] = bk;
            idx++;
        } else{
            System.out.println("Tidak bisa menambahkan data, kapasitas maksimum telah tercapai");
        }
    }
    
    public void tampil(){
        for (Buku25 buku25 : listBuku) {
            buku25.tampilDataBuku();
        }
    }

    public int findSeqSearch(String cari){
        int posisi = -1;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku.equals(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void tampilposisi(String kodeBuku, int pos){
        if (pos != -1) {
            System.out.println("Data: " + kodeBuku + " ditemukan pada indeks " + pos);
        } else{
            System.out.println("Data " + kodeBuku + " tidak ditemukan");
        }

    }

    public void tampilData(String kodeBuku, int pos){
        if (pos != -1) {
            System.out.println("Kode Buku : " + kodeBuku);
            System.out.println("Judul : " + listBuku[pos].judul);
            System.out.println("Tahun Terbit : " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBuku[pos].pengarang);
            System.out.println("Stock : " + listBuku[pos].stock);
        }else{
            System.out.println("Data " + kodeBuku + " tidak ditemukan");
        }
    }
    
    public Buku25 findBuku (String cari){
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku.equals(cari)) {
                return listBuku[i];
            }
        }
        return null;
    }

    public int findBinarySearch(String cari, int left, int right){
        if (right >= left) {
            int mid = (left + right) / 2;
            if (cari.equals(listBuku[mid].kodeBuku)) {
                return mid;
            } else if (listBuku[mid].kodeBuku.compareTo(cari) < 0) { 
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
