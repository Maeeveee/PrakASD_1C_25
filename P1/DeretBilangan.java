import java.util.Scanner;

public class DeretBilangan {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        long NIM=0;
        System.out.print("Masukkan NIM anda : ");
        NIM = sc25.nextLong();
        int HasilNIM =(int) (NIM % 100);
        if (HasilNIM<10) {
            HasilNIM+=10;
        }
        for (int i = 1; i <= HasilNIM; i++) {            
            if (i%2 ==0) {
                if (i==6||i==10) {
                continue;
                }                
                System.out.print(i);      
            }else{
                System.out.print(" * ");
            }
            
        }
    }
}
