package problem.lv0.다항식_더하기;

public class Main {

    static String solution(String polynomial) {
        String[] strs = polynomial.split("[+ ]+");

        int x = 0;
        int c = 0;

        for(String str : strs) {
            if(str.charAt(str.length() - 1) == 'x') {
                x += (str.equals("x")) ? 1 : Integer.parseInt(str.substring(0, str.length() - 1));
            }
            else {
                c += Integer.parseInt(str);
            }
        }

        StringBuilder sb = new StringBuilder();

        if(x == 1) {
            if(c == 0) {
                sb.append("x");
            }
            else {
                sb.append("x " + "+ " + c);
            }
        }
        else {
            if(x == 0) {
                sb.append(c);
            }
            else {
                if(c == 0) {
                    sb.append(x + "x");
                }
                else {
                    sb.append(x + "x " + "+ " + c);
                }
            }
        }

        String answer = sb.toString();

        return answer;
    }

    public static void main(String[] args) {
        //한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.

        String polynomial = "3x + 7 + x";    //answer = 4x + 7

        System.out.println("[" + polynomial + "]을(를) 계산하면 [" + solution(polynomial) + "]이(가) 됩니다.");

    }

}
