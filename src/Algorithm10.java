import java.util.Scanner;

public class Algorithm10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        JeongSeung10 jeongSeung10 = new JeongSeung10();
        int[][] square = jeongSeung10.makeSquare(n);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class JeongSeung10 {
    public int[][] makeSquare(int n) {
        int[][] square = new int[n][n];
        int cnt = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                square[i][j] = ++cnt;
            }
        }
        return square;
    }
}
