public class RoyalGarden {
    static int [][] RoyalGarden= new int[4][4];

    public static void main(String[] args) {
        inisialisasiRoyalGarden();

        int []Harga = new int[]{75000,50000,60000,10000};  

        int TotalHarga = 0;
        for (int j = 0; j < RoyalGarden.length; j++) {
            int HargaSementara = 0;
            for (int i = 0; i < RoyalGarden[j].length; i++) {
                HargaSementara += (RoyalGarden[j][i] * Harga[i]);
            }
            TotalHarga += HargaSementara;
            TampilHarga(TotalHarga, (j + 1));
            TotalHarga = 0;
        }
        UpdateStock();
    }

    static void inisialisasiRoyalGarden() {
        //RoyalGarden 1
        RoyalGarden[0][0] = 10;
        RoyalGarden[0][1] = 5;
        RoyalGarden[0][2] = 15;
        RoyalGarden[0][3] = 7;
        //royalGarden 2
        RoyalGarden[1][0] = 6;
        RoyalGarden[1][1] = 11;
        RoyalGarden[1][2] = 9;
        RoyalGarden[1][3] = 12;
        //RoyalGarden 3
        RoyalGarden[2][0] = 2;
        RoyalGarden[2][1] = 10;
        RoyalGarden[2][2] = 10;
        RoyalGarden[2][3] = 5;
        //RoyalGarden 4
        RoyalGarden[3][0] = 5;
        RoyalGarden[3][1] = 7;
        RoyalGarden[3][2] = 12;
        RoyalGarden[3][3] = 9;
    }

    static void UpdateStock() {
        String NamaBunga[] = new String[]{"aglonema","Keladi","Alocasia","Mawar"};
        int StockUpdate[] = new int[]{-1,-2,0,-5};
        for (int i = 0; i < StockUpdate.length; i++) {
            System.out.println(NamaBunga[i] + " stock barang " + (RoyalGarden[3][i] + StockUpdate[i]));
        }
    }
    static void TampilHarga(int a, int b) {
        System.out.println("Total pendapatan RoyalGarden "+b+" : "+a);        
    }
}
