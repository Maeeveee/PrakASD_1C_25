import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        int NIM=0;
        System.out.println("Masukkan 2 digit terakhir NIM anda : ");
        NIM = sc25.nextInt();
        for (int i = 1; i <= NIM; i++) {            
            if (i%2 ==0) {
                System.out.print(i);
                System.out.print(" * ");
            }
            
        }
    }
}
