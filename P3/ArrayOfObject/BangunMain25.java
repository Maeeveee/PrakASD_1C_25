package P3.ArrayOfObject;

import P3.ArrayBalok.segitiga25;

public class BangunMain25 {
    public static void main(String[] args) {
    segitiga25 sg1 = new segitiga25(5, 10);
    segitiga25 sg2 = new segitiga25(10, 15);
    segitiga25 sg3 = new segitiga25(15, 20);
    
    PersegiPanjang25 pp1 = new PersegiPanjang25(5, 10);
    PersegiPanjang25 pp2 = new PersegiPanjang25(2, 8);
    PersegiPanjang25 pp3 = new PersegiPanjang25(10, 15);
    
    segitiga25[] s = new segitiga25[3];
    PersegiPanjang25[] p = new PersegiPanjang25[3];

    s[0] = sg1;
    s[1] = sg2;
    s[2] = sg3;
    p[0] = pp1;
    p[1] = pp2;
    p[2] = pp3;

    BangunDatar25 bd = new BangunDatar25();
    bd.tambahSgt(s);
    bd.tambahPp(p);
    bd.tampilBangunDatar();


    }
}
