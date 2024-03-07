package P3.ArrayOfObject;

public class Persegi25Main {
    public static void main(String[] args) {
        Persegi25[] pgArray = new Persegi25[100];
        pgArray[5] = new Persegi25();
        pgArray[5].sisi = 20;
        System.out.println(pgArray[5].sisi);
    }
}
