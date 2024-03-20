package P4.Faktorial;

import java.util.Scanner;

public class faktorialMain25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        System.out.println("--------------------");
        System.out.println("Masukkan jumlah elemen");
        int jml = sc25.nextInt();

        faktorial25[] fk25 = new faktorial25[jml];
        for (int i = 0; i < jml; i++) {
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            int Nilai = sc25.nextInt();
            fk25[i] = new faktorial25(Nilai);
        }

        System.out.println("Hasil - BRUTE FORCE");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah "+ fk25[i].FaktorialBF(fk25[i].nilai));
        }
        System.out.println("Hasil - DIVIDE AND CONQUER");
        for (int i = 0; i < jml; i++) {
            System.out.println("Hasil perhitungan faktorial menggunakan Divide And Conquer adalah "+ fk25[i].FaktorialDC(fk25[i].nilai));
        }
    }
}
