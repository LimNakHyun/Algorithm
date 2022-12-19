package problem.lv0.한_번만_등장한_문자;

public class Main {

    static String solution(String s) {        
        int[] alCount = new int['z' - 'a' + 1];
        for(int i = 0; i < s.length(); i++) {
            alCount[(int) s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < alCount.length; i++) {
            if(alCount[i] == 1) sb.append((char) (i + 'a'));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        //문자열 s가 매개변수로 주어진다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 리턴
        //단, 한 번만 등장하는 문자가 없을 경우 빈 문자열을 리턴

        String s = "hello";    //answer = eho

        System.out.println("[" + s + "]" + "에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열: " + solution(s));

    }

}
