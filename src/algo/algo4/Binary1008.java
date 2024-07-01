package algo.algo4;

import java.util.Scanner;

public class Binary1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = sc.nextInt();
        int cnt = 0;
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
