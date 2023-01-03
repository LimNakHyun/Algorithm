package problem.lv0.로그인_성공;

import java.util.Arrays;

public class Main {

    static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for(int i = 0; i < db.length; i++) {
            if(db[i][0].equals(id_pw[0])) {
                answer = "wrong pw";
                if(db[i][1].equals(id_pw[1])) answer = "login";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //머쓱이는 프로그래머스에 로그인하려고 한다. 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
        //다음과 같이 로그인 성공, 실패에 따른 메시지를 리턴

        //아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 리턴, 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”을,
        //아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 리턴

        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};    //answer = login

        String loginStatus = solution(id_pw, db);

        System.out.println("로그인 시도 계정: " + Arrays.toString(id_pw));
        System.out.print("데이터베이스: ");
        for(String[] account: db) {
            System.out.print(Arrays.toString(account) + " ");
        }
        System.out.println("\n");

        if(loginStatus == "fail") {
            System.out.println("일치하는 아이디가 없습니다. 로그인에 실패하였습니다.");
        } else if(loginStatus == "wrong pw") {
            System.out.println("비밀번호가 틀립니다.");
        } else {
            System.out.println("로그인에 성공하였습니다.");
        }

    }

}
