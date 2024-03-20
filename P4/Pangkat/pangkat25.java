package P4.Pangkat;

public class pangkat25 {
    public int nilai,pangkat;

    public pangkat25(int a, int b){
        nilai = a;
        pangkat = b;
    }
    public int pangkatBF(int a,int b){
        int hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public int pangkatDC(int a,int b){
        if (b==0) {
            return 1;
        } else if (b % 2 == 1) {
            return pangkatDC(a, b / 2) * pangkatDC(a, b / 2) * a;
        } else {
            return pangkatDC(a, b / 2) * pangkatDC(a, b / 2);
        }

    }
}
