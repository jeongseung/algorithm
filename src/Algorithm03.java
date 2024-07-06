import java.util.Scanner;

public class Algorithm03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
        }
        JeongSeung3 jeongSeung3 = new JeongSeung3();
        System.out.println(jeongSeung3.findMode(arr));
    }
}

class JeongSeung3 {

    int findMode(int[] arr) {
        int mode[] = new int[10];
        for(int i=0; i<10; i++) {
            mode[arr[i]]++;
        }
        int max = 0;
        int idx = 0;
        for(int i=0; i<10; i++) {
            if(max<mode[i]) {
                max = mode[i];
                idx = i;
            }
        }
        return idx;
    }
}
