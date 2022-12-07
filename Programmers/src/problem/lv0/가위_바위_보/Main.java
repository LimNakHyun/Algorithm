package problem.lv0.가위_바위_보;

public class Main {
    
    static String solution(String rsp) {
        char[] ans = rsp.toCharArray();
        
        for(int i = 0; i < rsp.length(); i++) {
            ans[i] = (ans[i] == '2' ? '0' : (ans[i] == '0' ? '5' : '2'));
        }
        
        return String.valueOf(ans);
    }

    public static void main(String[] args) {
        //가위는 2 바위는 0 보는 5로 표현한다.
        //가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
        //rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 리턴

        // String rsp = "2";       //answer = "0"
        String rsp = "205";     //answer = "052"

        System.out.println("가위 바위 보를 모두 이기는 방법: " + solution(rsp));

    }

}
