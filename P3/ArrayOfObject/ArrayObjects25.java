package P3.ArrayOfObject;

import java.util.Scanner;

public class ArrayObjects25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        PersegiPanjang25[][] ppArray = new PersegiPanjang25[3][2];
        
        for (int j = 0; j < ppArray[0].length; j++) {

            for (int i = 0; i < ppArray.length; i++) {
            ppArray[i][j] = new PersegiPanjang25();
            System.out.println("persegi panjang ke-"+i);
            System.out.print("Masukkan panjang : ");
            ppArray[i][j].panjang = sc25.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i][j].lebar = sc25.nextInt();            
            }
            
        }
        
        for (int i = 0; i < ppArray[0].length; i++) {
       for (int j = 0; j < ppArray.length; j++) {
         System.out.println("Persegi Panjang ke-"+i);
         System.out.println("Panjang: " + ppArray[j][i].panjang + ", lebar: " + ppArray[j][i].lebar);
        }
       }
    }
}
