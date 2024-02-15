import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        long NIM=0;
        System.out.print("Masukkan NIM anda : ");
        NIM = sc25.nextLong();
        int HasilNIM =(int) (NIM % 100);
        for (int i = 1; i <= HasilNIM; i++) {            
            if (i%2 ==0) {
                System.out.print(i);
                System.out.print(" * ");
            }
            
        }
    }
}
