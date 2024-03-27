package P5.sumArray;

import java.util.Scanner;

public class sumMain25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung Keuntungan total (Satuan juta . misal 5.9)");
        System.out.print("Masukkan Jumlah Perusahaan : ");
        int banyakPerusahaan = sc25.nextInt();

        Sum25[] jmlPrusahaan = new Sum25[banyakPerusahaan];

        for (int i = 0; i < jmlPrusahaan.length; i++) {
            System.out.print("Masukkan jumlah bulan Perusahaan "+(i+1)+": ");
            int elm = sc25.nextInt();

            jmlPrusahaan[i] = new Sum25(elm);
            System.out.println("==============================");
            for (int j = 0; j < jmlPrusahaan[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (1 + j) + " : ");
                jmlPrusahaan[i].keuntungan[j] = sc25.nextDouble();
            }
        }

        System.out.println("==============================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < banyakPerusahaan; i++) {
            System.out.println(
                    "Total keuntungan perusahaan "+(i+1)+" selama " + jmlPrusahaan[i].elemen + " bulan adalah " + jmlPrusahaan[i].totalBF(jmlPrusahaan[i].keuntungan));
            
        }
        System.out.println("==============================");
        System.out.println("Algoritma Divide And Conquer");
        for (int i = 0; i < banyakPerusahaan; i++) {
            System.out.printf("total keuntungan perusahaan "+(i+1)+" selama %d bulan adalah %.2f", jmlPrusahaan[i].elemen,
            jmlPrusahaan[i].totalDC(jmlPrusahaan[i].keuntungan, 0, jmlPrusahaan[i].elemen - 1));   
        }
    }
}
