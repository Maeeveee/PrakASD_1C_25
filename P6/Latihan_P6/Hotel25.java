package P6.Latihan_P6;

public class Hotel25 {
    String nama;
    String kota;
    int harga;
    Byte bintang;

    public Hotel25(String n, String k,int h, Byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
    public void TampilDataHotel(){
        System.out.println("Nama Hotel : "+nama);
        System.out.println("Lokasi : "+kota);
        System.out.println("Harga : "+harga);
        System.out.println("Rating : "+bintang);
    }
}
