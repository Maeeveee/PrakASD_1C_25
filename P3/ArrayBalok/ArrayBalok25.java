package P3.ArrayBalok;

public class ArrayBalok25 {
    public static void main(String[] args) {
        Balok25[] blArray = new Balok25[3];
        blArray[0] = new Balok25(100, 30, 12);
        blArray[1] = new Balok25(120, 40, 15);
        blArray[2] = new Balok25(210, 50, 25);
         for (int i = 0; i < 3; i++) {
            System.out.println("volume balok ke "+ i + ": "+blArray[i].hitungVolume());
         }
    }
}
