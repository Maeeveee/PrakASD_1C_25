import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        System.out.println("1. Rumus kecepatan");
        System.out.println("2. Rumus jarak");
        System.out.println("3. Rumus waktu");
        System.out.print("Pilih menu : ");
        int pilihan =sc25.nextInt();

        int waktu=0, jarak=0, kecepatan=0;
        switch (pilihan) {            
            case 1:
                System.out.print("Masukkan jarak : ");
                jarak = sc25.nextInt();
                System.out.print("Masukkan waktu : ");
                waktu = sc25.nextInt();
                System.out.print("Hasilnya adalah : "+Kecepatan(jarak, waktu));
                
            break;

            case 2:
                System.out.print("Masukkan kecepatan : ");
                kecepatan = sc25.nextInt();
                System.out.print("Masukkan waktu : ");
                waktu = sc25.nextInt();
                System.out.println("Hasilnya adalah : "+jarak(kecepatan, waktu));
            break;

            case 3: 
            System.out.print("Masukkan jarak : ");
                jarak = sc25.nextInt();
                System.out.print("Masukkan kecepatan : ");
                kecepatan = sc25.nextInt();
                System.out.println("Hasilnya adalah : "+waktu(jarak, kecepatan));
            break;

            default:
                break;
        }
    }
    static double Kecepatan(int a, int b){
    double hasil=0;
    hasil = a/b;
    return hasil;
    };

    static double jarak(int a, int b){
    double hasil = 0;
    hasil = a*b;
    return hasil;
    }

    static double waktu(int a, int b){
    double hasil =0;
    hasil = a/b;
    return hasil;
    }
}
