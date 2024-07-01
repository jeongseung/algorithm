package algo.algo3;

import java.util.Scanner;

public class Mode1008 {
    public static void main(String[] args) {
        int[] mode = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<mode.length; i++) {
            mode[i] = sc.nextInt();
        }
        int[] tmp = new int[mode.length];
        for(int i=0; i<mode.length; i++) {
            int d = mode[i];
            tmp[d]++;
        }

        int max = 0;
        int idx = 0;
        for(int i=0; i<mode.length; i++) {
            if(tmp[i]>max) {
                max = tmp[i];
                idx = i;
            }
        }

        System.out.println(idx);


    }
}
