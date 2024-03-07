package P3.ArrayBalok;

public class Segitiga25Main {
    public static void main(String[] args) {
    segitiga25[] sgArray25 = new segitiga25[4];
    
    sgArray25[0] = new segitiga25(10 , 4);
    sgArray25[1] = new segitiga25(20 , 10);
    sgArray25[2] = new segitiga25(15 ,6);
    sgArray25[3] = new segitiga25(25 , 10);

    for (int i = 0; i < sgArray25.length; i++) {
        System.out.println("luas segitiga ke-"+(i+1)+" "+sgArray25[i].hitungLuas()+"keliling segitiga ke-"+(i+1)+" "+sgArray25[i].hitungKeliling());
    }
    }
}
