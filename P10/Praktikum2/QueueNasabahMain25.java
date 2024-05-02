package P10.Praktikum2;
import java.util.Scanner;
public class QueueNasabahMain25 {
    public static void menu(){
        System.out.println("Pilihan menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian paling belakang");
    }
    public static void main(String[] args) {
        Scanner sc25 =  new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue : ");
        int jumlah  = sc25.nextInt();
        QueueNasabah25 antri = new QueueNasabah25(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc25.nextInt();
            sc25.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening : ");
                    String norek = sc25.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc25.nextLine();
                    System.out.print("Alamat : ");
                    String alamat = sc25.nextLine();
                    System.out.print("Umur : ");
                    int umur = sc25.nextInt();
                    sc25.nextLine();
                    System.out.print("Saldo : ");
                    double saldo = sc25.nextDouble();

                    Nasabah25 nb = new Nasabah25(norek, nama, alamat, umur, saldo);
                    sc25.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2: 
                    Nasabah25 data = antri.dequeue();
                    if (!"".equals(data.norek)&&!"".equals(data.nama)&&!"".equals(data.alamat)&&data.umur != 0 && data.saldo !=0) {
                        System.out.println("Antrian yang keluar : "+data.norek+" "+data.nama+" "+data.alamat+" "+data.umur+" "+data.alamat);
                    }
                    break;
                case 3:
                antri.peek();
                    break;
                case 4:
                antri.print();
                    break;
                case 5: 
                antri.peekRear();
                    break;
                default:
                    break;
            }
        } while (pilih == 1||pilih == 2||pilih == 3||pilih == 4);
    }
}
