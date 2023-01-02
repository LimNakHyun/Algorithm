package problem.lv0.캐릭터의_좌표;

import java.util.Arrays;

public class Main {

    static int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int wid = board[0] / 2;
        int ver = board[1] / 2;
        
        for(String s : keyinput) {
            switch(s) {
                case "left":
                    if(answer[0] > (-1) * wid) answer[0]--;
                    break;
                case "right":
                    if(answer[0] < wid) answer[0]++;
                    break;
                case "up":
                    if(answer[1] < ver) answer[1]++;
                    break;
                case"down":
                    if(answer[1] > (-1) * ver) answer[1]--;
                    break;
                default:break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        //머쓱이는 RPG게임을 하고 있다. 게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동한다.
        //예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]이다.
        //머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어진다. 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 리턴

        String[] keyinput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};    //answer = [2, 1]

        System.out.println("맵의 크기가 " + Arrays.toString(board) + "이며, 키 입력이 " + Arrays.toString(keyinput) + "일 때, 캐릭터의 위치: " + Arrays.toString(solution(keyinput, board)));

    }

}
