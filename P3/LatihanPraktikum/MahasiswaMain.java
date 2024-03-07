package P3.LatihanPraktikum;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        DataMahasiswa[] MahasiswaArray = new DataMahasiswa[3];

        for (int i = 0; i < MahasiswaArray.length; i++) {
            MahasiswaArray[i] = new DataMahasiswa(null, null, null, 0.0);
            System.out.println("Data Mahasiswa Ke-"+(i+1));
            System.out.print("Masukkan Nama Mahasiswa : ");
            MahasiswaArray[i].Nama = sc25.nextLine();
            System.out.print("Masukkan NIM : ");
            MahasiswaArray[i].NIM = sc25.nextLine();
            System.out.print("Pilih Jenis Kelamain (P/L) ");
            MahasiswaArray[i].Jkelamin = sc25.nextLine();
            System.out.print("Masukkan IPK Mahasiswa : ");
            MahasiswaArray[i].IPK = sc25.nextDouble();
            sc25.nextLine();
        }

        for (int i = 0; i < MahasiswaArray.length; i++) {
            System.out.println("Data Mahasiswa Ke-"+(i+1));
            System.out.println("Nama : "+MahasiswaArray[i].Nama);
            System.out.println("NIM : "+MahasiswaArray[i].NIM);
            System.out.println("Jenis Kelamin : "+MahasiswaArray[i].Jkelamin);
            System.out.println("IPK : "+MahasiswaArray[i].IPK);
        }
         tampilkanMahasiswaTertinggi(MahasiswaArray);
         System.out.println("Rata Rata IPK adalah : "+ hitungRataRataIPK(MahasiswaArray));
       
    }
    public static void tampilkanMahasiswaTertinggi(DataMahasiswa[] mahasiswaArray) {
        double ipkTertinggi = mahasiswaArray[0].IPK;
        int indeks = 0;

        for (int i = 1; i < mahasiswaArray.length; i++) {
            if (mahasiswaArray[i].IPK > ipkTertinggi) {
                ipkTertinggi = mahasiswaArray[i].IPK;
                indeks = i;
            }
        }

        System.out.println("\nMahasiswa dengan IPK Tertinggi:");
        System.out.println("Nama: " + mahasiswaArray[indeks].Nama);
        System.out.println("NIM: " + mahasiswaArray[indeks].NIM);
        System.out.println("Jenis Kelamin: " + mahasiswaArray[indeks].Jkelamin);
        System.out.println("IPK: " + mahasiswaArray[indeks].IPK);
    }
    public static double hitungRataRataIPK(DataMahasiswa[] mahasiswaArray) {
        double totalIPK = 0;

        for (DataMahasiswa mahasiswa : mahasiswaArray) {
            totalIPK += mahasiswa.IPK;
        }

        return totalIPK / mahasiswaArray.length;
    }
    
}
