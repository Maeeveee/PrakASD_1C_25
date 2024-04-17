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
    public void sortBukuByKode() {
        for (int i = 0; i < listBuku.length - 1; i++) {
            for (int j = 0; j < listBuku.length - i - 1; j++) {
                if (listBuku[j].kodeBuku.compareTo(listBuku[j + 1].kodeBuku) > 0) {
                    //swap
                    Buku25 temp = listBuku[j];
                    listBuku[j] = listBuku[j + 1];
                    listBuku[j + 1] = temp;
                }
            }
        }
    }
    
    public int findBinarySearch(String cari, int left, int right){
        if (right >= left) {
            int mid = (left + right) / 2;
            int comparisonResult = listBuku[mid].kodeBuku.compareTo(cari);
            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) { 
                return findBinarySearch(cari, mid + 1, right);
            } else {
                return findBinarySearch(cari, left, mid - 1); 
            }
        }
        return -1;
    }
    public void sortBukuByJudul() {
        for (int i = 0; i < listBuku.length - 1; i++) {
            for (int j = 0; j < listBuku.length - i - 1; j++) {
                if (listBuku[j].judul.compareTo(listBuku[j + 1].judul) > 0) {
                    // Tukar posisi
                    Buku25 temp = listBuku[j];
                    listBuku[j] = listBuku[j + 1];
                    listBuku[j + 1] = temp;
                }
            }
        }
    }
    public int findSeqSearchByJudul(String judul){
        int count = 0;
        int indexBuku = -1;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].judul.equalsIgnoreCase(judul)) {
                if (indexBuku == -1) {
                    indexBuku = i;
                } else {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("Ada lebih dari 1 buku dengan judul " + judul);
        }
        return indexBuku;
    }
    public int findBinarySearchByJudul(String judul, int left, int right){
        if (right >= left) {
            int mid = (left + right) / 2;
            if (judul.equals(listBuku[mid].judul)) {
                return mid;
            } else if (listBuku[mid].judul.compareTo(judul) < 0) { 
                return findBinarySearchByJudul(judul, left, mid - 1);
            } else {
                return findBinarySearchByJudul(judul, mid + 1, right);
            }
        }
        return -1;
    }
}
