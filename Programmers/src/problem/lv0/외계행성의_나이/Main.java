package problem.lv0.외계행성의_나이;

public class Main {
    
    static String solution(int age) {
        StringBuilder sb = new StringBuilder();

        while(age != 0) {
            sb.insert(0, (char)(age % 10 + (int)'a'));
            age /= 10;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        //우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 되었다.
        //입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있다.
        //a는 0, b는 1, c는 2, ..., j는 9이다. 예를 들어 23살은 cd, 51살은 fb로 표현한다.
        //나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 리턴

        int age = 23;    //answer = cd

        System.out.println(age + "살의 PROGRAMMER-962식 나이: " + solution(age));

    }

}
