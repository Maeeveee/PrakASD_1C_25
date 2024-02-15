import java.util.Scanner;

public class Hitung_IP_Semester {
    static String KonversiHuruf(int[]arr){
        String konversi=null;
        int a = arr[0];
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
    static double BobotNilai(int []arr){
        double konversi=0;
        int a = arr[0];
        if (a>80&&a<=100) {
            konversi = 4;
        }if (a>73&&a<=80) {
            konversi = 3.5;
        }if (a>65&&a<=73) {
            konversi = 3;
        }if (a>60&&a<=65) {
            konversi = 2.5;
        }if (a>50&&a<=60) {
            konversi = 2;
        }if (a>39&&a<=50) {
            konversi = 1;
        }if (a>=0&&a<=39) {
            konversi = 0;
        }
        return konversi;
    }
    
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        String[]MataKuliah = new String[]
        {"Pancasila","KTI","CTPS","MatDas","B inggris","DasPro","PrakDasPro","K3"};

        int[]Nilai = new int[MataKuliah.length];
        int[]SKS = new int []{2,2,2,3,2,2,3,2};
        for (int i = 0; i <+ MataKuliah.length; i++) {
            System.out.print("Masukan nilai Mata Kuliah "+MataKuliah[i]+ " : ");
            Nilai[i] = sc25.nextInt();
        }
        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");
        System.out.printf("%-15s%-10s%-15s%-10s%n", "Mata Kuliah", "Nilai", "Konversi Huruf", "Bobot Nilai");
    for (int i = 0; i < MataKuliah.length; i++) {
    System.out.printf("%-15s%-10d%-15s%-10s%n", MataKuliah[i], Nilai[i], KonversiHuruf(new int[]{Nilai[i]}), BobotNilai(new int[]{Nilai[i]}));
    }
    System.out.println("=====================");
    double ip=0,ipHasil=0;
    int sks=0;
    for (int i = 0; i < MataKuliah.length; i++) {
        ip = ((BobotNilai(new int[]{Nilai[i]}))*(SKS[i]));
        ipHasil+=ip;
        sks+=SKS[i];
    }
    double totalIP = ipHasil/sks;
    System.out.printf("IP : %.2f%n",totalIP);

    }
}
