package problem.lv1.같은_숫자는_싫어;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //배열 arr이 주어지면 연속적으로 나타나는 수는 제거하고 남은 수들을 리턴

        int[] arr = {1,1,3,3,0,1,1};

        int[] temp = new int[arr.length];
        temp[0] = arr[0];

        int idx = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                temp[idx++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(temp));  // [1, 3, 0, 1, 0, 0, 0]
        System.out.println(idx);    // 4

        int[] answer = new int[idx];
        for(int i = 0; i < idx; i++) {
            answer[i] = temp[i];
        }

        System.out.println(Arrays.toString(answer));    // [1, 3, 0, 1]

    }
}
