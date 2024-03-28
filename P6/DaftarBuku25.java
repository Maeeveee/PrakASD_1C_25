package P6;

public class DaftarBuku25 {
    Buku25 listBK[] = new Buku25[5];
    int idx;

    void tambah(Buku25 m){
        if (idx<listBK.length) {
            listBK[idx] = m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
    void tampil(){
        for (Buku25 m : listBK) {
            m.tampilDataBuku();
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listBK.length - 1; i++) {
            for (int j = 0; j < listBK.length - i - 1; j++) {
                if (listBK[j].stock > listBK[j+1].stock) {
                    Buku25 tempBK = listBK[j];
                    listBK[j] = listBK[j+1];
                    listBK[j+1] = tempBK;
                }
            }
        }
    }
    void selectionSort(){
        for (int i = 0; i < listBK.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listBK.length; j++) {
                if (listBK[j].stock > listBK[idxMin].stock) {
                    idxMin = j;
                }
            }
            //swap
            Buku25 tempBuku25 = listBK[idxMin];
            listBK[idxMin] = listBK[i];
            listBK[i] = tempBuku25;
        }
    }
    void insertionSort(){
        for (int i = 1; i < listBK.length; i++) {
            Buku25 temp = listBK[i];
            int j = i;
            while (j > 0 && listBK[j-1].stock > temp.stock) {
                listBK[j] = listBK[j-1];
                j--;
            }
            listBK[j] = temp;
        }
    }
}
