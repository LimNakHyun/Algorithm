package library.numberTheory;

public class PascalsTriangle {

    //다이나믹 프로그래밍으로 구현한 파스칼의 삼각형을 활용하여 nCr 구하기
    public static long dynamicCombination(int n, int r) {
        long[][] combination = new long[n + 1][n + 1];

        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j <= i && j != r + 1; j++) {
                if(i == j || j == 0) combination[i][j] = 1;
                else combination[i][j] = combination[i - 1][j] + combination[i - 1][j - 1];
            }
        }
        return combination[n][r];
    }
}
