import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        String []PlatNomor= new String[]{"A","B","D","E","F","G","H","L","N","T"};
        String [][]Daerah = new String[10][12];
        Daerah[0] = new String [] {"B","A","N","T","E","N"};
        Daerah[1] = new String [] {"J","A","K","A","R","T","A"};
        Daerah[2] = new String [] {"B","A","N","D","U","N","G"};
        Daerah[3] = new String [] {"C","I","R","E","B","O","N"};
        Daerah[4] = new String [] {"B","O","G","O","R"};
        Daerah[5] = new String [] {"P","E","K","A","L","O","N","G","A","N"};
        Daerah[6] = new String [] {"S","E","M","A","R","A","N","G"};
        Daerah[7] = new String [] {"S","U","R","A","B","A","Y","A"};
        Daerah[8] = new String [] {"M","A","L","A","N","G"};
        Daerah[9] = new String [] {"T","E","G","A","L"};

        System.out.print("Masukkan Plat Nomor : ");
        String Plat = sc25.nextLine();
        int IndexPlat = 0;
        for (int i = 0; i < PlatNomor.length; i++) {
            if (Plat.equalsIgnoreCase(PlatNomor[i])) {
                break;
            }
            IndexPlat++;
        }
        System.out.print("Daerah dari Plat tersebut adalah : ");
        for (int i = 0; i < Daerah[IndexPlat].length; i++) {
            System.out.print(Daerah[IndexPlat][i]);
        }
    }
}
