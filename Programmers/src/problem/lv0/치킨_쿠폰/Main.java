package problem.lv0.치킨_쿠폰;

public class Main {

    static int solution(int chicken) {
        int answer = 0;
        int coupon = 0;

        while(chicken > 0) {
            answer += chicken / 10;
            coupon += chicken % 10;
            chicken /= 10;

            if(coupon >= 10) {
                answer += coupon / 10;
                coupon = coupon / 10 + coupon % 10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급한다.
        //쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급된다.
        //시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 리턴

        int chicken = 100;    //answer = 11

        System.out.println("치킨을 " + chicken + "마리 시키면 서비스로 최대 " + solution(chicken) + "마리를 받을 수 있습니다.");

    }

}
