package problem.lv0.합성수_찾기;

public class Main {
    
    static int primeCount(int n) {
        boolean[] prime = new boolean[n + 1];
        prime[0] = prime[1] = true;
        
        for(int i = 2; i * i <= n; i++) {
            if(!prime[i]) {
                for(int j = i * i; j <= n; j+=i) prime[j] = true;
            }
        }
        
        int count = 0;
        for(boolean p : prime) {
            if(!p) count++;
        }
        return count;
    }
    static int solution(int n) {
        return n - 1 - primeCount(n);
    }

    public static void main(String[] args) {
        //약수의 개수가 세 개 이상인 수를 합성수라고 한다.
        //자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 리턴

        int n = 10;    //answer = 5

        System.out.println("자연수 " + n + " 이하의 합성수의 개수: " + solution(n));

    }

}
