import java.util.Scanner;

public class Algorithm04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        JeongSeung04 jeongSeung04 = new JeongSeung04();
        jeongSeung04.trans(n);
    }
}
class JeongSeung04 {

    void trans(int n) {
        int cnt = 0;
        int[] arr = new int[100];
        while(n>=1) {

            int d = n % 2;
            arr[cnt] = d;
            n /= 2;
            cnt++;
        }

        for(int i=cnt-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}
