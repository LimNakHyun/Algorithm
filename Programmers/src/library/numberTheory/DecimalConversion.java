package library.numberTheory;

import library.baseConcept.Swap;

public class DecimalConversion {
    //입력받은 10진수를 n진수 (2 ≤ n ≤ 36, n은 자연수)로 변환하는 알고리즘
    public static int decimalConversion(int x, int r, char[] d) {
        //변환할 10진수 x, 변환할 진법 r
        //d는 변환될 수의 자릿수보다 긴 char 배열

        int digits = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++) sb.append((char)(i + '0'));
        for(int i = 0; i < 'Z' - 'A' + 1; i++) sb.append((char)(i + 'A'));
        //0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ 문자열 만들기

        do {
            d[digits++] = sb.charAt(x % r);
            x /= r;
        } while (x != 0);

        for(int i = 0; i < digits / 2; i++) {
            Swap.swapChar(d, i, digits - i - 1);
        }

        return digits;

    }

    public static void main(String[] args) {
        int x = 12;
        int r = 2;
        int digits = 4;
        char[] d = new char[32];

        decimalConversion(x, r, d);
        for(int i = 0; i < digits; i++) {
            System.out.print(d[i]);
        }
        
    }

}
