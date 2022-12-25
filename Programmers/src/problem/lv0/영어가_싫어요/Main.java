package problem.lv0.영어가_싫어요;

public class Main {

    static long solution(String numbers) {
        
        String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < 10; i++) {
            numbers = numbers.replaceAll(number[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }

    public static void main(String[] args) {
        //영어로 표기되어있는 숫자를 수로 바꾸려고 한다. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 리턴

        String numbers = "onefourzerosixseven";    //answer = 14067;

        System.out.println(numbers + "를 정수로 바꾼 수: " + solution(numbers));

    }

}
