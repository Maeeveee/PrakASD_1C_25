package P4.Pangkat;

import java.util.Scanner;

public class pangkatMain25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("Masukkan jumlah elemen yang dihitung : ");
        int elemen = sc25.nextInt();

        pangkat25[] png = new pangkat25[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan : ");
            int nilai = sc25.nextInt();
            System.out.print("Masukkan nilai pemangkat : ");
            int pangkat = sc25.nextInt();

            png[i] = new pangkat25(nilai, pangkat);
        }
        System.out.println("Pilih Menu Pemangkatan");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide And Conquer");
        System.out.print("Pilih");
        int pilih = sc25.nextInt();
        switch (pilih) {
            case 1:
            System.out.println("Hasil Pangkat - Brute Force");
            for (int j = 0; j < elemen; j++) {
                System.out.println("Hasil Dari "+png[j].nilai+" pangkat "+png[j].pangkat+" adalah "+png[j].pangkatBF(png[j].nilai, png[j].pangkat));
            }
                break;
            
            case 2:
            System.out.println("Hasil Pangkat -Divide And Conquer");
            for (int i = 0; i < png.length; i++) {
                System.out.println("Hasil Dari "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                
            }
                break;
            
            default:
            System.out.println("Pilihan tidak tersedia");
                break;
        }
       
    }
}
