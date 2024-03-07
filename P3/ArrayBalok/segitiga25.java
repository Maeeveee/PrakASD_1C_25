package P3.ArrayBalok;

public class segitiga25 {
    public int alas;
    public int tinggi;

    public segitiga25(int a, int t){
       alas = a;
       tinggi = t; 
    }
    public double hitungLuas(int a, int t){
        return (a*t)/2;
    }
    public double hitungKeliling(){
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        double keliling = alas + tinggi + sisiMiring;
        return keliling;
    }
    
}
