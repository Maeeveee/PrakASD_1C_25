package P5.sumArray;

public class Sum25 {
    public int elemen;
    public double keuntungan[], total;

public Sum25(int elemen){
    this.elemen = elemen;
    this.keuntungan = new double[elemen];
    this.total = 0;
}

public double totalBF(double arr[]){
    for (int i = 0; i < elemen; i++) {
        total = total + arr[i];
    }
    return total;
}
public double totalDC(double arr[], int l, int r){
    if (l==r) {
       return arr[l]; 
    }else if (l<r){
        int mid = (l+r) /2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid+1, r);
        return lsum + rsum;
    }
    return 0;
}
}
