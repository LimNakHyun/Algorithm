package problem.lv0.k의_개수;

import java.util.List;
import java.util.ArrayList;

public class Main {

    static int countNum(int n, int m) {
        int cnt = 0;
        while(n > 0) {
            if(n % 10 == m) cnt++;
            n /= 10;
        }
        return cnt;
    }
    
    static int solution(int i, int j, int k, List<Integer> list) {
        int answer = 0;
        
        for(int n = i; n <= j; n++) {
            if(countNum(n, k) != 0) list.add(n);
            answer += countNum(n, k);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장한다.
        //정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 리턴

        int i = 10;
        int j = 50;
        int k = 5;    //answer = 5

    List<Integer> inKList = new ArrayList<>();

    int numOfK = solution(i, j, k, inKList);

    System.out.println(i + "부터 " + j + "까지 " + k + "는 " + inKList + "로 " + numOfK + "번 등장한다.");

    }

}
