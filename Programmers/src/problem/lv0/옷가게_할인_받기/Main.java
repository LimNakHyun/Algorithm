package problem.lv0.옷가게_할인_받기;

public class Main {
    
    static int solution(int price) {
        double sale = (price >= 500000) ? (0.8) : (price >= 300000) ? (0.9) : (price >= 100000) ? (0.95) : (1.0);
        return (int) (sale * price);
    }

    public static void main(String[] args) {
        //10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해주는 옷가게가 있다.
        //구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 리턴
        
        int price = 150000;     //답 : 142500

        System.out.println("할인받은 가격 : " + solution(price) + "원");

    }

}
