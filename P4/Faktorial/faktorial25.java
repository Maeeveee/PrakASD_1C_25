package P4.Faktorial;

public class faktorial25 {
    public int nilai;
    
public faktorial25(int n){
    nilai = n;
}

public int FaktorialBF(int n){
    int fakto = 1;
    for (int i = 1; i <= n; i++) {
        fakto *= i;
    }
    return fakto;
}

public int FaktorialDC(int n){
    if (n==1) {
        return 1;
    } 
    else {
        int fakto = n * FaktorialDC(n-1);
        return fakto;
    }
}

}
