package P5.sumArray;

import java.util.Scanner;

public class sumMain25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung Keuntungan total (Satuan juta . misal 5.9)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc25.nextInt();

        Sum25 sm25 = new Sum25(elm);
        System.out.println("==============================");
        for (int i = 0; i < sm25.elemen; i++) {
            System.out.print("Masukkan untung bulan ke-"+(1+i)+" : ");
            sm25.keuntungan[i] = sc25.nextDouble();
        }
        System.out.println("==============================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+sm25.elemen+" bulan adalah "+sm25.totalBF(sm25.keuntungan));
        System.out.println("==============================");
        System.out.println("Algoritma Divide And Conquer");
        System.out.printf("total keuntungan perusahaan selama %d bulan adalah %.2f",sm25.elemen,sm25.totalDC(sm25.keuntungan, 0, sm25.elemen-1));
    }
}
