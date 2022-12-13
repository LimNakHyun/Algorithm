package problem.lv1.year2016;

public class Main {
    static String[] c = {"THU", "FRI", "SAT" ,"SUN", "MON", "TUE", "WED"};

    static String solution(int a, int b) {
        if(a > 1) {
            for(int i = 2; i < a + 1; i++) {
                if(i==2 || i==4 || i==6 || i==8 || i==9 || i==11) {
                    b += 31;
                } else if(i==5 || i==7 || i==10 || i==12) {
                    b += 30;
                } else{
                    b += 29;
                }
            }
        }
        return c[b % 7];
    }
    
    public static void main(String[] args) {

        //2016년 1월 1일은 금요일이다.
        //이때 a월 b일의 요일을 구하시오
        int a = 5;
        int b = 24;

        System.out.println("2016년 " + a + "월 " + b + "일의 요일: " + solution(a, b)); //2016년 5월 24일은 수요일이므로 TUE를 리턴
    }

}
