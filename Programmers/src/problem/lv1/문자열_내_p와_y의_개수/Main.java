package problem.lv1.문자열_내_p와_y의_개수;

public class Main {

    static boolean solution(String s) {
        return s.replaceAll("[^pP]", "").length() - s.replaceAll("[^yY]", "").length() == 0;
    }

    public static void main(String[] args) {
        //대문자와 소문자가 섞여있는 문자열 s가 주어진다.
        //s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 리턴
        //'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴
        //단, 개수를 비교할 때 대문자와 소문자는 구별하지 않는다.

        String s = "pPoooyY";    //answer = treu

        boolean stringChk = solution(s);

        System.out.print("문자열 [" + s + "]에 있는 p와 y의 개수는 ");
        if(stringChk) {
            System.out.println("서로 같습니다.");
        } else {
            System.out.println("서로 다릅니다.");
        }

    }

}
