package P5.showRoom;

public class showroomMain25 {
    public static void main(String[] args) {
        showroom25[] koleksi = new showroom25[8];
        koleksi[0] = new showroom25("BMW", "M2 Coupe", "2016", 6816, 728);
        koleksi[1] = new showroom25("Ford", "Fiesta ST", "2014", 3921, 525);
        koleksi[2] = new showroom25("Nissan", "370Z", "2009", 4360, 657);
        koleksi[3] = new showroom25("Subaru", "BRZ", "2014", 4058, 609);
        koleksi[4] = new showroom25("Subaru", "Impreza WRX STI", "2013", 6255, 703);
        koleksi[5] = new showroom25("Toyota", "AE86 Trueno", "1986", 3700, 553);
        koleksi[6] = new showroom25("Toyota", "86/GT86", "2014", 4180, 609);
        koleksi[7] = new showroom25("Volkswagen", "Golf GTI", "2014", 4180, 631);

        int[] minMax = koleksi[0].cariNilai(koleksi, 0, koleksi.length-1);
        System.out.println("Mobil Accelaration Terendah : ");
        koleksi[0].outputacc(koleksi, minMax[0]);
        System.out.println("========================================");
        System.out.println("Mobil Accelaration Tertinggi : ");
        koleksi[0].outputacc(koleksi, minMax[1]);

        double RataPow = koleksi[0].rata(koleksi);
        System.out.println("rata rata power semua kendaraan : "+RataPow);
    }
    
}