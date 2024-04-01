package P6.Latihan_P6;

public class HotelService25 {
    Hotel25[] rooms = new Hotel25[5];
    int idx;

    public void tambah(Hotel25 H){
    if (idx<rooms.length) {
            rooms[idx] = H;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }
    public void tampilAll(){
        for (Hotel25 H : rooms) {
            H.TampilDataHotel();
        }
    }
    //Sorting Harga
    //----------------------------------------------------------------
    public void BubbleSortHarga(){
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j].harga > rooms[j+1].harga) {
                    Hotel25 tempHT = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = tempHT;
                }
            }
        }
    }
    public void selectionSortHarga(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].harga > rooms[idxMax].harga) {
                    idxMax = j;
                }
            }
            //swap
            Hotel25 tempHotel25 = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = tempHotel25;
        }
    }
    //----------------------------------------------------------------

    //Sorting Rating
    //----------------------------------------------------------------
    public void BubbleSortRating(){
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j].bintang > rooms[j+1].bintang) {
                    Hotel25 tempHT = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = tempHT;
                }
            }
        }
    }
    public void selectionSortRating(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMax = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMax].bintang) {
                    idxMax = j;
                }
            }
            //swap
            Hotel25 tempHotel25 = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = tempHotel25;
        }
    }
    //---------------------------------------------------------------------
}
