package library.numberTheory;

public class EuclideanAlgorithm {
    
    public static int GCD(int n, int m) {
        if(m == 0) return n;
        return GCD(m, n % m);
    }

    public static int LCM(int n, int m) {
        return n * m / (GCD(n, m));
    }

}
