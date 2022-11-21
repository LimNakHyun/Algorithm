package problem.lv2.N개의_최소공배수;

import library.numberTheory.EuclideanAlgorithm;

public class Main {
    
    public static void main(String[] args) {
        //두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미한다.
        //예를 들어 2와 7의 최소공배수는 14가 된다.
        //정의를 확장해서, n개의 수의 최소공배수는 n개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 된다.
        //n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 리턴

        int[] arr = {2,6,8,14};     //answer = 168;

        int lcm = arr[0];
        for(int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " 와 " + lcm + " 과의 최소공배수: ");
            lcm = EuclideanAlgorithm.LCM(arr[i], lcm);
            System.out.println(lcm);
        }
    
    }

}
