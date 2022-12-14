package problem.lv0.A로_B_만들기;

public class Main {

    static int solution(String before, String after) {
        int answer = 1;
        
        int[] alpha1 = new int['z' - 'a' + 1];
        int[] alpha2 = new int['z' - 'a' + 1];
        
        for(int i = 0; i < before.length(); i++) {
            alpha1[before.charAt(i) - 'a']++;
            alpha2[after.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 'z' - 'a' + 1; i++) {
            if(alpha1[i] != alpha2[i]) {
                answer = 0;
                break;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        //문자열 before와 after가 매개변수로 주어질 때,
        //before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 리턴

        String before = "olleh";
        String after = "hello";    //answer = 1

        String canMake = solution(before, after) == 1 ? "있다" : "없다";
        System.out.println(before + "의 순서를 바꾸어 " + after + "를 만들 수 " + canMake + ". 그러므로 답은 [" + solution(before, after) + "] 이다.");

    }

}
