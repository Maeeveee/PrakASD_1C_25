package P3.LatihanPraktikum;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        DataMahasiswa[] MahasiswaArray = new DataMahasiswa[3];

        for (int i = 0; i < MahasiswaArray.length; i++) {
            MahasiswaArray[i] = new DataMahasiswa(null, null, null, null);
            System.out.println("Data Mahasiswa Ke-"+(i+1));
            System.out.print("Masukkan Nama Mahasiswa : ");
            MahasiswaArray[i].Nama = sc25.nextLine();
            System.out.print("Masukkan NIM : ");
            MahasiswaArray[i].NIM = sc25.nextLine();
            System.out.print("Pilih Jenis Kelamain (P/L) ");
            MahasiswaArray[i].Jkelamin = sc25.nextLine();
            System.out.println("Masukkan IPK Mahasiswa : ");
            MahasiswaArray[i].IPK = sc25.nextLine();
        }

        for (int i = 0; i < MahasiswaArray.length; i++) {
            System.out.println("Data Mahasiswa Ke-"+(i+1));
            System.out.println("Nama : "+MahasiswaArray[i].Nama);
            System.out.println("NIM : "+MahasiswaArray[i].NIM);
            System.out.println("Jenis Kelamin : "+MahasiswaArray[i].Jkelamin);
            System.out.println("IPK : "+MahasiswaArray[i].IPK);
        }
    }
}
