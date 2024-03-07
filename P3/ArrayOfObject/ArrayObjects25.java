package P3.ArrayOfObject;

import java.util.Scanner;

public class ArrayObjects25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        PersegiPanjang25[] ppArray = new PersegiPanjang25[3];
        
        for (int i = 0; i < 3; i++) {
        ppArray[i] = new PersegiPanjang25();
        System.out.println("persegi panjang ke-"+i);
        System.out.print("Masukkan panjang : ");
        ppArray[i].panjang = sc25.nextInt();
        System.out.print("Masukkan lebar : ");
        ppArray[i].lebar = sc25.nextInt();            
        }
        
       for (int i = 0; i < 3; i++) {
        System.out.println("Persegi Panjang ke-"+i);
        System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
       }
    }
}
