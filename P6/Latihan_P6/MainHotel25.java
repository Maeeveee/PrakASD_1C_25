package P6.Latihan_P6;

public class MainHotel25 {
    public static void main(String[] args) {
    HotelService25 listHotel25 = new HotelService25();
    
    Hotel25 H = new Hotel25("Melati", "Malang", 250000, (byte)3);
    Hotel25 H1 = new Hotel25("Santika", "Malang", 200000, (byte)4);
    Hotel25 H2= new Hotel25("Putra Sulung", "Surabaya", 140000, (byte)2);
    Hotel25 H3 = new Hotel25("Sekar Jati", "Malang", 7500000, (byte)5);
    Hotel25 H4 = new Hotel25("Amsterdam", "Malang", 100000, (byte)5);

    listHotel25.tambah(H);
    listHotel25.tambah(H1);
    listHotel25.tambah(H2);
    listHotel25.tambah(H3);
    listHotel25.tambah(H4);

    System.out.println("----------------------------");
    System.out.println("Daftar Hotel");
    listHotel25.tampilAll();

    System.out.println("\n----------------------------");
    System.out.println("Sorting Harga Ascending (Bubble)");
    listHotel25.BubbleSortHarga();
    listHotel25.tampilAll();

    System.out.println("\nSorting Rating Ascending (Bubble)");
    listHotel25.BubbleSortRating();
    listHotel25.tampilAll();

    System.out.println("\n----------------------------");
    System.out.println("Sorting Harga Ascending (Selection)");
    listHotel25.selectionSortHarga();
    listHotel25.tampilAll();

    System.out.println("\nSorting Rating Ascending (Selection)");
    listHotel25.selectionSortRating();
    listHotel25.tampilAll();
    }    
}
