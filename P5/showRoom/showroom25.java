package P5.showRoom;

public class showroom25 {
    public String merk, tipe, tahun;
    public int top_acc;
    public double top_pow;

    public showroom25(String merk, String tipe, String tahun, int top_acc, double top_pow){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acc = top_acc;
        this.top_pow = top_pow;
    }
    int[] cariNilai(showroom25[] arr, int l, int r){
        int min, max;

        if (l == r) {
           return new int[]{arr[l].top_acc, arr[l].top_acc};
        } 
        else if (l < r) {
            int mid = (l+ r)/2;
            int [] left = cariNilai(arr, l, mid);
            int [] right = cariNilai(arr, mid+1, r);

            max = Math.max(left[1], right[1]);
            min = Math.max(left[0], right[0]);
            return new int[] {min, max};
        }
        return new int[] {0, 0};
    }
    public void outputacc(showroom25[] arr, int acc){
        for (showroom25 kendaraan : arr) {
            if (kendaraan.top_acc == acc) {
                System.out.println("merk :"+kendaraan.merk+" tipe : "+kendaraan.tipe+" tahun : "+kendaraan.tahun+ " top acc : "+kendaraan.top_acc);
                break;
            }
        }
    }
    double rata(showroom25[] arr){
        double jumlah = 0;
        for (showroom25 showroom25 : arr) {
            jumlah += showroom25.top_pow;
        }
        return jumlah / arr.length;
    }
}
