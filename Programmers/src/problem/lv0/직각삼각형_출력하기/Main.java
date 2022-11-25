package problem.lv0.직각삼각형_출력하기;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //"*"의 높이와 너비를 1이라고 했을 때,
        //"*"을 이용해 직각 이등변 삼각형을 그리려고한다.
        //정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하라

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            // System.out.println("*".repeat(i));
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
