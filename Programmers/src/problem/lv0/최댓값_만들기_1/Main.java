package problem.lv0.최댓값_만들기_1;

public class Main {
    static int solution(int[] numbers) {
        int max = numbers[0];
        int max2 = numbers[1];
        for(int i = 2; i < numbers.length; i++) {
            if(numbers[i] >= max) {
                max2 = (max >= max2) ? max : max2;
                max = numbers[i];
            }
        }
        return max * max2;
    }

    public static void main(String[] args) {
        //정수 배열 numbers가 매개변수로 주어진다.
        //numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 리턴
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("최댓값 : " + solution(numbers));

    }
}
