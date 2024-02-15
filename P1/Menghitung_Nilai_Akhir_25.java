import java.util.Scanner;

/**
 * Menghitung_Nilai_Akhir_25
 */
public class Menghitung_Nilai_Akhir_25 {
    static double hitung(int a,int b,int c,int d){
        double hasilTugas = a*0.2;
        double hasilKuis = b*0.2;
        double hasilUAS = c*0.3;
        double hasilUTS = d*0.3;
        double hasil = hasilTugas+hasilKuis+hasilUTS+hasilUAS;
        return hasil;
    }
    static String konversi (double a){
        String konversi=null;
        if (a>80&&a<=100) {
            konversi = "A";
        }if (a>73&&a<=80) {
            konversi = "B+";
        }if (a>65&&a<=73) {
            konversi = "B";
        }if (a>60&&a<=65) {
            konversi = "C+";
        }if (a>50&&a<=60) {
            konversi = "C";
        }if (a>39&&a<=50) {
            konversi = "D";
        }if (a>=0&&a<=39) {
            konversi = "E";
        }
        return konversi;
    }
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        int UAS,UTS,Kuis,Tugas;
        System.out.println("=======================");
        System.out.print("Masukkan nilai Tugas : ");
        Tugas = sc25.nextInt();
        System.out.print("Masukkan nilai Kuis : ");
        Kuis = sc25.nextInt();
        System.out.print("Masukkan nilai UTS : ");
        UTS = sc25.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        UAS = sc25.nextInt();
        System.out.println("=======================");
        if (Tugas<0||Tugas>100||Kuis<0||Kuis>100||UTS<0||UTS>100||UAS<0||UAS>100) {
            System.out.println("Input Nilai Tidak Valid");
        }else{
            System.out.println("Nilai Akhir : "+hitung(UAS, UTS, Kuis, Tugas));
            System.out.println("Konversi nilai anda : "+konversi(hitung(UAS, UTS, Kuis, Tugas)));
            if (konversi(hitung(UAS, UTS, Kuis, Tugas)).equalsIgnoreCase("D")||konversi(hitung(UAS, UTS, Kuis, Tugas)).equalsIgnoreCase("E")) {
                System.out.println("Anda dinyatakan tidak lulus");
            }else{
                System.out.println("Anda dinyatakan lulus");
            }
        }
        
    }
}