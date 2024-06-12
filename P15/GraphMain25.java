package P15;

import java.util.Scanner;

public class GraphMain25 {
    public static void main(String[] args)throws Exception {
        Scanner sc25 = new Scanner(System.in);
        graph25 gedung = new graph25(6);

        do {
        System.out.println("1. Add Edge");
        System.out.println("2. Remove Ecge");
        System.out.println("3. Degree");
        System.out.println("4. Print Graph");
        System.out.println("5. Cek Edge");
        System.out.println("6. Update Jarak");
        System.out.println("7. Hitung Edge");
        System.out.println("8. Exit");
        System.out.print("Pilih Menu : ");
        int pilihan = sc25.nextInt();
        sc25.nextLine();

            switch (pilihan) {
                case 1:
                System.out.print("Masukkan asal: ");
                int asal = sc25.nextInt();
                System.out.print("Masukkan tujuan: ");
                int tujuan = sc25.nextInt();
                System.out.print("Masukkan jarak: ");
                int jarak = sc25.nextInt();
                gedung.addEdge(asal, tujuan, jarak);
                break;

            case 2:
                System.out.print("Masukkan asal: ");
                asal = sc25.nextInt();
                System.out.print("Masukkan tujuan: ");
                tujuan = sc25.nextInt();
                gedung.removeEdge(asal, tujuan);
                break;

            case 3:
                System.out.print("Masukkan gedung (index): ");
                int gedungIndex = sc25.nextInt();
                gedung.degree(gedungIndex);
                break;

            case 4:
                gedung.printGraph();
                break;

            case 5:
                System.out.print("Masukkan asal: ");
                asal = sc25.nextInt();
                System.out.print("Masukkan tujuan: ");
                tujuan = sc25.nextInt();
                if (gedung.isPathExist(asal, tujuan)) {
                    System.out.println("Path exists.");
                } else {
                    System.out.println("Path does not exist.");
                }
                break;
            case 6:
                System.out.print("Masukkan asal: ");
                asal = sc25.nextInt();
                System.out.print("Masukkan tujuan: ");
                tujuan = sc25.nextInt();
                System.out.print("Masukkan jarak baru: ");
                jarak = sc25.nextInt();
                gedung.updateJarak(asal, tujuan, jarak);
                break;

            case 7:
                int edgeCount = gedung.hitungEdge();
                System.out.println("Jumlah edge dalam graf: " + edgeCount);
                break;
            case 8:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
            }
            
        } while (true);
    }
}
