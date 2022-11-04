package library.algebra;

// 2차방정식의 근의공식
public class QuadraticFormula {

    // 2차방정식의 판별식
    public static double Discriminant(int a, int b, int c) {
        return Math.sqrt(b * b - 4 * a * c);
    }
    
    // 2차방정식의 근의공식 메소드
    public static double[] quadraticFormula(int a, int b, int c) {
        double[] answer = new double[2];
        answer[0] = (-b + Discriminant(a, b, c)) / 2 * a;
        answer[1] = (-b - Discriminant(a, b, c)) / 2 * a;
        return answer;
    }
    
}
