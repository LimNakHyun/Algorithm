package problem.lv2.다음_큰_숫자;

public class Main {

    static int solution(int n) {
        String b = Integer.toBinaryString(n).replace("0", "");
        for(int i = n + 1; i < 1000000; i++) {
            if(Integer.toBinaryString(i).replace("0", "").length() == b.length()) {
                n = i;
                break;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        //자연수 n이 주어질 때,
        //n 보다 큰 수 중에 2진수로 바꿨을 때,
        //n과 1의 개수가 같은 수 중 가장 작은 수를 리턴
        
        int n = 78;
        // System.out.println(solution(n));
        // System.out.println(Integer.toBinaryString(n));
        System.out.println(n + " : " + Integer.toBinaryString(n));
        System.out.println("1의 개수 : " + Integer.bitCount(n));
        System.out.println();
        
        int nBitCount = Integer.bitCount(n);
        int answer = n + 1;
        while(true) {
            String temp = Integer.toBinaryString(answer);
            System.out.println(answer + " : " + temp);
            System.out.println("1의 개수 : " + Integer.bitCount(answer));
            System.out.println();
            if(nBitCount == Integer.bitCount(answer++)) break;
        }
        System.out.println(n + " 다음 큰 숫자 : " + (answer - 1)); //
        
    }
}
