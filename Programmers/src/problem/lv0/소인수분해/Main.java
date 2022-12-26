package problem.lv0.소인수분해;

import java.util.Arrays;

public class Main {

    static void makePrimeArr(boolean[] arr) {
        for(int i = 2; i * i < arr.length; i++) {
            for(int j = i * i; j < arr.length; j += i) {
                if(!arr[i]) arr[j] = true;
            }
        }
    }

    static int[] solution(int n) {
        boolean[] prime = new boolean[(int)(n / 2) + 1];
        prime[0] = prime[1] = true;
        makePrimeArr(prime);

        int cnt = 0;
        for(int i = 0; i < prime.length; i++) {
            if(!prime[i] && i > 0) {
                cnt++;
                if(n % i != 0) {
                    prime[i] = true;
                    cnt--;
                }
            }
        }

        int[] answer = new int[(cnt == 0) ? 1 : cnt];
        int count = 0;
        for(int i = 2; i < prime.length; i++) {
            if(!prime[i]) answer[count++] = i;
        }
        if(cnt == 0) answer[0] = n;


        return answer;
    }

    public static void main(String[] args) {
        //소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

        int n = 420;    //answer = [2, 3, 5, 7]

        System.out.println(n + "의 소인수: " + Arrays.toString(solution(n)));

    }

}
