package P15;

import java.util.Scanner;

public class GraphMain25 {
    public static void main(String[] args)throws Exception {
        Scanner sc25 = new Scanner(System.in);
        graph25 gedung = new graph25(6);
        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();
        gedung.removeEdge(1, 3);
        gedung.printGraph();
        System.out.print("Masukkan Asal : ");
        int asal = sc25.nextInt();
        System.out.print("Masukkan Tujuan : ");
        int tujuan = sc25.nextInt();

        if (gedung.isPathExist(asal, tujuan)) {
            System.out.println("Ada jalur antara gedung " + (char) ('A' + asal) + " dan gedung " + (char) ('A' + tujuan));
        } else {
            System.out.println("Tidak ada jalur antara gedung " + (char) ('A' + asal) + " dan gedung " + (char) ('A' + tujuan));
        }
    }
}
