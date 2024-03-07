package P3.ArrayOfObject;

import P3.ArrayBalok.segitiga25;

public class BangunDatar25 {
    segitiga25[] segitigas;
    PersegiPanjang25[] persegiPanjangs;

    void tambahSgt(segitiga25[] segitiga){
        this.segitigas = segitiga;
    }
    void tambahPp(PersegiPanjang25[] persegiPanjang){
        this.persegiPanjangs = persegiPanjang;
    }
    void tampilBangunDatar(){
        for (int i = 0; i < persegiPanjangs.length; i++) {
            System.out.println("Persegi Panjang "+ (i+1));
            System.out.println("lebar: "+persegiPanjangs[i].lebar);
            System.out.println("Panjang: "+persegiPanjangs[i].panjang);
        }
        System.out.println("==============================================");
        for (int i = 0; i < persegiPanjangs.length; i++) {
            System.out.println("Segitiga "+ (i+1));
            System.out.println("Alas: "+segitigas[i].alas);
            System.out.println("Tinggi: "+segitigas[i].tinggi);
        }
    }
}
