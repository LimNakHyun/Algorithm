package problem.lv0.문자열_밀기;

public class Main {

    static StringBuilder pushString(StringBuilder sb) {
        sb.insert(0,sb.charAt(sb.length() - 1));
        sb.deleteCharAt(sb.length() - 1);
        
        return sb;
    }
    
    static int solution(String A, String B) {
        StringBuilder sb1 = new StringBuilder(A);
        
        int answer = 0;
        
        for(int i = 0; i < A.length(); i++) {
            answer += 1;
            if(pushString(sb1).toString().equals(B)) break;
        }
        
        return (answer != 0 && answer != A.length()) ? answer : (A.equals(B) ? 0 : -1);
    }

    public static void main(String[] args) {
        //문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 이것을 문자열을 민다고 정의한다면
        //문자열 A와 B가 매개변수로 주어질 때, A를 밀어서 B가 될 수 있다면 몇 번 밀어야 하는지 횟수 리턴 후 밀어서 B가 될 수 없으면 -1을 리턴

        String A = "hello";
        String B = "ohell";    //answer = 1

        int availableNum = solution(A, B);

        System.out.println("문자열 A: " + A);
        System.out.println("문자열 B: " + B);
        if(availableNum < 0) {
            System.out.println(A + "를 밀어서 " + B + "를 만들 수 없다.");
        } else {
            System.out.println(A + "를 " + availableNum + "번 밀면 " + B + "를 만들 수 있다.");
        }

    }

}
