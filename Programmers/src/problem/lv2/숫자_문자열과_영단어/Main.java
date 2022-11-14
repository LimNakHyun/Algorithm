package problem.lv2.숫자_문자열과_영단어;

public class Main {
    
    public static void main(String[] args) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String s = "one4seveneight";

        // StringBuilder sb = new StringBuilder(s);
        // System.out.println("변환전 문자열: " + sb);
        System.out.println("변환전 문자열: " + s);

        for(int i = 0; i < numbers.length; i++) {
            s = s.replace(numbers[i], String.valueOf(i));
        }

        System.out.println("변환후 문자열: " + s);
    }

}
