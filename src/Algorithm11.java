import java.util.Arrays;
import java.util.Scanner;


public class Algorithm11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        JeongSeung11 jeongSeung11 = new JeongSeung11();
        int[][] square = jeongSeung11.makeSquare(n);
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}
class JeongSeung11 {

    int[][] makeSquare(int n) {
        int [][] square = new int[n][n];
        int cnt = 1;
        for(int i=0; i<n; i++) {
            if(i%2==0) {
                for(int j=0; j<n; j++) {
                    square[i][j] = cnt++;
                }
            } else {
                for(int j=n-1; j>=0; j--) {
                    square[i][j] = cnt++;
                }
            }
        }
        return square;
    }


}


