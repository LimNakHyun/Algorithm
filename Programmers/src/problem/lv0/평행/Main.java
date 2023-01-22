package problem.lv0.평행;

import java.util.Arrays;

public class Main {

    static boolean isParallel(int[] dot0, int[] dot1, int[] dot2, int[] dot3) {
        double inclination1 = (dot1[0] - dot0[0] == 0) ? 1000 : ((dot1[1] - dot0[1]) / (double) (dot1[0] - dot0[0]));
        double inclination2 = (dot3[0] - dot2[0] == 0) ? 1000 : ((dot3[1] - dot2[1]) / (double) (dot3[0] - dot2[0]));

        return inclination1 == inclination2;
    }
    
    static int solution(int[][] dots) {

        int answer = (isParallel(dots[0], dots[1], dots[2], dots[3]) || isParallel(dots[0], dots[2], dots[1], dots[3]) || isParallel(dots[0], dots[3], dots[1], dots[2])) ? 1 : 0;

        return answer;
    }

    public static void main(String[] args) {
        //주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1을 없으면 0을 리턴

        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        System.out.println("네 점: ");
        for(int[] dot: dots) {
            System.out.println(Arrays.toString(dot));
        }
        int chkParallel = solution(dots);

        if(chkParallel == 1) {
            System.out.println("은 평행이 되는 경우가 있다.");
        } else {
            System.out.println("은 평행이 되는 경우가 없다.");
        }

        //출력 : 
        // 네 점: 
        // [1, 4]
        // [9, 2]
        // [3, 8]
        // [11, 6]
        // 은 평행이 되는 경우가 있다.

    }

}
