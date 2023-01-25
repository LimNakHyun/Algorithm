package problem.lv0.중복된_문자_제거;

public class Main {

    static String solution(String my_string) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < my_string.length(); i++) {
            if(i == my_string.indexOf(my_string.charAt(i))) sb.append(my_string.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        //문자열 my_string이 매개변수로 주어진다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 리턴

        String my_string = "people";
        System.out.println(my_string + "에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열: " + solution(my_string));

        //출력 :
        //people에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열: peol
    }

}
