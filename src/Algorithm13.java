import java.util.Scanner;

public class Algorithm13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        JeongSeung13 jeongSeung13 = new JeongSeung13();
        int[][] square = jeongSeung13.makeSquare(n);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class JeongSeung13 {

    int[][] makeSquare(int n) {
        int[][] square = new int[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                square[i][j] = (i+1) * (j+1);
            }
        }
        return square;
    }
}
