package problem.lv0.만들기_2차원으로;

import java.util.Arrays;

public class Main {

    static int[][] solution(int[] num_list, int n) {
        int[][] result = new int[num_list.length / n][n];
        int temp = 0;
        
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < n; j++) {
                result[i][j] = num_list[temp++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //정수 배열 num_list와 정수 n이 매개변수로 주어진다. num_list를 2차원 배열로 바꿔 리턴

        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;    //answer = [[1, 2], [3, 4], [5, 6], [7, 8]]

        System.out.print("정수 배열 " + Arrays.toString(num_list) + "을 2차원 배열로 바꾼 결과: [");
        for(int i = 0; i < solution(num_list, n).length; i++) {
            if(i < solution(num_list, n).length - 1) {
                System.out.print(Arrays.toString(solution(num_list, n)[i]) + ", ");
            } else {
                System.out.print(Arrays.toString(solution(num_list, n)[i]));
            }
        }
        System.out.print("]");

    }

}
